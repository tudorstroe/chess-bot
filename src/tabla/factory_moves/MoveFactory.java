package tabla.factory_moves;

import tabla.piese.PieceType;

public class MoveFactory {
    public static MoveStrategy selectStrategy(PieceType pieceType){
        switch (pieceType){
            case PION: {
                return new MovePion();
            }
            default: {
                return null;
            }
        }
    }
}
