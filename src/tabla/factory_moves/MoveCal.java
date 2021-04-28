package tabla.factory_moves;

import tabla.Move;
import tabla.Patratel;
import tabla.PlayerColor;
import tabla.Tabla;

import java.util.ArrayList;

public class MoveCal implements MoveStrategy {
    public MoveCal() {
    }

    @Override
    public ArrayList<Move> getMoves(Patratel curr, Tabla tabla) {
        ArrayList<Move> result = new ArrayList<>();
        int x = curr.getX();
        int y = curr.getY();

        if (curr.getPiece().getColor() == PlayerColor.WHITE) {

            if(y<6 && x<7 && (!tabla.getTabla()[x+1][y+2].hasPiece() || tabla.getTabla()[x+1][y + 2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 1][y + 2]));
            }

            if(y<7 && x<6 &&( !tabla.getTabla()[x+2][y+1].hasPiece() || tabla.getTabla()[x+2][y + 1].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 2][y + 1]));
            }
            if(y>1 && x<7 && (!tabla.getTabla()[x+1][y-2].hasPiece() || tabla.getTabla()[x+1][y-2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 1][y - 2]));
            }
            if(y>0 && x<6 && (!tabla.getTabla()[x+2][y-1].hasPiece() || tabla.getTabla()[x + 2][y -1].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 2][y - 1]));
            }
            if(y<6 && x>0 && (!tabla.getTabla()[x-1][y+2].hasPiece() || tabla.getTabla()[x - 1][y + 2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 1][y + 2]));
            }
            if(y<7 && x>1 && (!tabla.getTabla()[x-2][y+1].hasPiece() || tabla.getTabla()[x - 2][y + 1].getPiece().getColor() != curr.getPiece().getColor())){
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 2][y + 1]));
            }
            if(y>1 && x>0 && (!tabla.getTabla()[x-1][y-2].hasPiece() || tabla.getTabla()[x - 1][y - 2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 1][y - 2]));
            }
            if(y>0 && x>1 && (!tabla.getTabla()[x-2][y-1].hasPiece() || tabla.getTabla()[x - 2][y -1].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 2][y - 1]));
            }

        }

        if (curr.getPiece().getColor() == PlayerColor.BLACK) {

            if(y<6 && x<7 && (!tabla.getTabla()[x+1][y+2].hasPiece() || tabla.getTabla()[x+1][y + 2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 1][y + 2]));
            }

            if(y<7 && x<6 &&( !tabla.getTabla()[x+2][y+1].hasPiece() || tabla.getTabla()[x+2][y + 1].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 2][y + 1]));
            }
            if(y>1 && x<7 && (!tabla.getTabla()[x+1][y-2].hasPiece() || tabla.getTabla()[x+1][y-2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 1][y - 2]));
            }
            if(y>0 && x<6 && (!tabla.getTabla()[x+2][y-1].hasPiece() || tabla.getTabla()[x + 2][y -1].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + 2][y - 1]));
            }
            if(y<6 && x>0 && (!tabla.getTabla()[x-1][y+2].hasPiece() || tabla.getTabla()[x - 1][y + 2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 1][y + 2]));
            }
            if(y<7 && x>1 && (!tabla.getTabla()[x-2][y+1].hasPiece() || tabla.getTabla()[x - 2][y + 1].getPiece().getColor() != curr.getPiece().getColor())){
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 2][y + 1]));
            }
            if(y>1 && x>0 && (!tabla.getTabla()[x-1][y-2].hasPiece() || tabla.getTabla()[x - 1][y - 2].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 1][y - 2]));
            }
            if(y>0 && x>1 && (!tabla.getTabla()[x-2][y-1].hasPiece() || tabla.getTabla()[x - 2][y -1].getPiece().getColor() != curr.getPiece().getColor())) {
                result.add(new Move(curr.getPiece(), tabla.getTabla()[x - 2][y - 1]));
            }

        }
        return result;
    }
}
