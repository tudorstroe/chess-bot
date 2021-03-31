package tabla.factory_moves;

import tabla.*;
import tabla.piese.Piece;

import java.util.ArrayList;

public class MovePion implements MoveStrategy{

    public MovePion() {
    }

    @Override
    public ArrayList<Move> getMoves(Patratel curr, Tabla tabla) {
        ArrayList<Move> result = new ArrayList<>();
        int x = curr.getX();
        int y = curr.getY();
        if (curr.getPiece().getColor() == PlayerColor.WHITE) {
            if (!curr.getPiece().isMoved()) {
                if (!tabla.getTabla()[x][y+1].hasPiece() && !tabla.getTabla()[x][y+2].hasPiece()){
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y+2]));
                }
            }
            if (y == 6){
                Piece queen = new Piece(curr, curr.getPiece().getColor());
                if (!tabla.getTabla()[x][y + 1].hasPiece()) {
                    result.add(new Move(queen, tabla.getTabla()[x][y + 1], true));
                }
                if (x > 0 && tabla.getTabla()[x - 1][y + 1].hasPiece() && tabla.getTabla()[x - 1][y + 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(queen, tabla.getTabla()[x - 1][y + 1], true));
                }
                if (x < 7 && tabla.getTabla()[x + 1][y + 1].hasPiece() && tabla.getTabla()[x + 1][y + 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(queen, tabla.getTabla()[x + 1][y + 1], true));
                }
            } else {
                if (y < 7 && !tabla.getTabla()[x][y + 1].hasPiece()) {
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y + 1]));
                }
                if (y < 7 && x > 0 && tabla.getTabla()[x - 1][y + 1].hasPiece() && tabla.getTabla()[x - 1][y + 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 1][y + 1]));
                }
                if (y < 7 && x < 7 && tabla.getTabla()[x + 1][y + 1].hasPiece() && tabla.getTabla()[x + 1][y + 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 1][y + 1]));
                }
            }
        }
        else {
            if (!curr.getPiece().isMoved()) {
                if (!tabla.getTabla()[x][y-1].hasPiece() && !tabla.getTabla()[x][y-2].hasPiece()){
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y-2]));
                }
            }
            if (y == 1){
                Piece queen = new Piece(curr, curr.getPiece().getColor());
                if (!tabla.getTabla()[x][y - 1].hasPiece()) {
                    result.add(new Move(queen, tabla.getTabla()[x][y - 1], true));
                }
                if (x > 0 && tabla.getTabla()[x - 1][y - 1].hasPiece() && tabla.getTabla()[x - 1][y - 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(queen, tabla.getTabla()[x - 1][y - 1], true));
                }
                if (x < 7 && tabla.getTabla()[x + 1][y - 1].hasPiece() && tabla.getTabla()[x + 1][y - 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(queen, tabla.getTabla()[x + 1][y - 1], true));
                }
            } else {
                if (y > 0 && !tabla.getTabla()[x][y - 1].hasPiece()) {
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y - 1]));
                }
                if (y > 0 && x > 0 && tabla.getTabla()[x - 1][y - 1].hasPiece() && tabla.getTabla()[x - 1][y - 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 1][y - 1]));
                }
                if (y > 0 && x < 7 && tabla.getTabla()[x + 1][y - 1].hasPiece() && tabla.getTabla()[x + 1][y - 1].getPiece().getColor() != curr.getPiece().getColor()) {
                    result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 1][y - 1]));
                }
            }
        }
        return result;
    }
}
