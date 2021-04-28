package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Rege extends Piece{
    public Rege(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.REGE;
    }
}
