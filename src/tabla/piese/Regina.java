package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Regina extends Piece{
    public Regina(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.REGINA;
    }
}
