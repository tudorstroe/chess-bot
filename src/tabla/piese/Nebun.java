package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Nebun extends Piece{
    public Nebun(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.NEBUN;
    }
}
