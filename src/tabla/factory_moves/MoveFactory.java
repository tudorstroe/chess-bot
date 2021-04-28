package tabla.factory_moves;

import tabla.piese.PieceType;

public class MoveFactory {
    public static MoveStrategy selectStrategy(PieceType pieceType){
        switch (pieceType){
            case PION: {
                return new MovePion();
            }
            case NEBUN: {
                return new MoveNebun();
            }
            case CAL: {
                return new MoveCal();
            }
            case TURA: {
                return new MoveTura();
            }
            case REGE: {
                return new MoveRege();
            }
            case REGINA: {
                return new MoveRegina();
            }
            default: {
                return null;
            }
        }
    }
}
