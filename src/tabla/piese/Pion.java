package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Pion extends Piece{
    public Pion(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.PION;
    }
}
