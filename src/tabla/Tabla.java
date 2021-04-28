package tabla;

import tabla.factory_moves.MoveFactory;
import tabla.piese.Piece;
import tabla.piese.PieceType;
import tabla.piese.Pion;
import tabla.piese.Tura;
import tabla.piese.Nebun;
import tabla.piese.Cal;
import tabla.piese.Rege;
import tabla.piese.Regina;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Tabla {
    private Patratel[][] tabla;
    private PlayerColor machine = PlayerColor.BLACK;
    private PlayerColor currentPlayer = PlayerColor.WHITE;
    private ArrayList<Move> moves;

    private boolean ableToMove;

    public Tabla() {
        /*
        Codificare:
        x - este linia, si este prima coordonata
        y - coloana, a 2a coordonata
         */
        tabla = new Patratel[8][8];
        ableToMove = true;
    }

    public void generateMoves() {
        moves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabla[i][j].hasPiece() && tabla[i][j].getPiece().getType() != null && tabla[i][j].getPiece().getColor() == machine) {
                    moves.addAll(MoveFactory.selectStrategy(tabla[i][j].getPiece().getType()).getMoves(tabla[i][j], this));
                }
            }
        }
    }

    public void init() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabla[i][j] = new Patratel(i, j, null);
            }
        }

        for (int i = 0; i < 8; i++) {
            tabla[i][1].setPiece(new Pion(tabla[i][1], PlayerColor.WHITE));
            tabla[i][6].setPiece(new Pion(tabla[i][6], PlayerColor.BLACK));
        }
        tabla[0][0].setPiece(new Tura(tabla[0][0], PlayerColor.WHITE));
        tabla[7][0].setPiece(new Tura(tabla[7][0], PlayerColor.WHITE));
        tabla[0][7].setPiece(new Tura(tabla[0][7], PlayerColor.BLACK));
        tabla[7][7].setPiece(new Tura(tabla[7][7], PlayerColor.BLACK));

        tabla[1][0].setPiece(new Cal(tabla[1][0], PlayerColor.WHITE));
        tabla[6][0].setPiece(new Cal(tabla[6][0], PlayerColor.WHITE));
        tabla[1][7].setPiece(new Cal(tabla[1][7], PlayerColor.BLACK));
        tabla[6][7].setPiece(new Cal(tabla[6][7], PlayerColor.BLACK));

        tabla[2][0].setPiece(new Nebun(tabla[2][0], PlayerColor.WHITE));
        tabla[5][0].setPiece(new Nebun(tabla[5][0], PlayerColor.WHITE));
        tabla[2][7].setPiece(new Nebun(tabla[2][7], PlayerColor.BLACK));
        tabla[5][7].setPiece(new Nebun(tabla[5][7], PlayerColor.BLACK));

        tabla[3][0].setPiece(new Regina(tabla[3][0], PlayerColor.WHITE));
        tabla[3][7].setPiece(new Regina(tabla[3][7], PlayerColor.BLACK));

        tabla[4][0].setPiece(new Rege(tabla[4][0], PlayerColor.WHITE));
        tabla[4][7].setPiece(new Rege(tabla[4][7], PlayerColor.BLACK));
    }

    public Patratel[][] getTabla() {
        return tabla;
    }

    public void setTabla(Patratel[][] tabla) {
        this.tabla = tabla;
    }

    public PlayerColor getMachine() {
        return machine;
    }

    public void setMachine(PlayerColor machine) {
        this.machine = machine;
    }

    public PlayerColor getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerColor currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public boolean isAbleToMove() {
        return ableToMove;
    }

    public void setAbleToMove(boolean ableToMove) {
        this.ableToMove = ableToMove;
    }

    public void print(FileWriter fw) throws IOException {
        for (int j = 7; j >= 0; j--) {
            for (int i = 0; i < 8; i++) {
                if (tabla[i][j].hasPiece()) {
                    if (tabla[i][j].getPiece().getType() == PieceType.PION) {
                        if (tabla[i][j].getPiece().getColor() == PlayerColor.WHITE) {
                            fw.write("  PION ");
                        } else {
                            fw.write("  pion ");
                        }
                    }
                    if (tabla[i][j].getPiece().getType() == PieceType.NEBUN) {
                        if (tabla[i][j].getPiece().getColor() == PlayerColor.WHITE) {
                            fw.write("  NEBUN ");
                        } else {
                            fw.write("  nebun ");
                        }
                    }
                } else {
                    fw.write("       ");
                }
            }
            fw.write("\n");
        }
        fw.write("\n");
    }

    public void executeMove(Move move) {
        int x = move.getDest().getX();
        int y = move.getDest().getY();

        move.getPiece().getPatratel().setPiece(null);
        move.getPiece().setMoved(true);
        tabla[x][y].setPiece(move.getPiece());
        tabla[x][y].getPiece().setPatratel(tabla[x][y]);
	if (currentPlayer == PlayerColor.WHITE){
            currentPlayer = PlayerColor.BLACK;
	}
	else {
            currentPlayer = PlayerColor.WHITE;
	}
    }

    public void update(String move) {
        char[] movearr = move.toCharArray();
        int oldx = (int) movearr[0] - (int) 'a';
        int oldy = (int) movearr[1] - (int) '1';
        int newx = (int) movearr[2] - (int) 'a';
        int newy = (int) movearr[3] - (int) '1';

        Piece piece = tabla[oldx][oldy].getPiece();
        Move recvMove = new Move(piece, tabla[newx][newy]);
        if (move.length() == 5) {
            // promotion
            recvMove.setPromoted(true);
        }
//        //debug
//        System.out.println(piece);
//        System.out.println(oldx + " " + oldy + " " + newx + " " + newy);
        executeMove(recvMove);
    }
}
