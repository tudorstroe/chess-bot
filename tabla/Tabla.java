package tabla;

import tabla.factory_moves.MoveFactory;

import java.util.ArrayList;

public class Tabla {
    private Patratel[][] tabla;
    private PlayerColor machine = PlayerColor.BLACK;
    private PlayerColor currentPlayer = PlayerColor.WHITE;
    private ArrayList<Move> moves;

    public Tabla() {
        /*
        Codificare:
        x - este linia, si este prima coordonata
        y - coloana, a 2a coordonata
         */
        tabla =  new Patratel[8][8];
    }

    public void generateMoves(){
        moves = new ArrayList<>();
        for (int i=0; i<8; i++){
            for (int j=0;j<8;j++){
                if (tabla[i][j].hasPiece() && tabla[i][j].getPiece().getType() != null && tabla[i][j].getPiece().getColor() == machine){
                    moves.addAll(MoveFactory.selectStrategy(tabla[i][j].getPiece().getType()).getMoves(tabla[i][j], this));
                }
            }
        }
    }

    public void init(){
        for (int i=0; i<8; i++){
            for (int j=0;j<8;j++){
                tabla[i][j] = new Patratel(i,j, null);
            }
        }

        for (int i=0; i<8; i++) {
            tabla[i][0].setPiece(new Piece(tabla[i][0], PlayerColor.WHITE));
            tabla[i][1].setPiece(new Pion(tabla[i][1], PlayerColor.WHITE));

            tabla[i][6].setPiece(new Pion(tabla[i][6], PlayerColor.BLACK));
            tabla[i][7].setPiece(new Piece(tabla[i][7], PlayerColor.BLACK));
        }
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
}
