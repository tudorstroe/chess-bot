package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Tura extends Piece{
    public Tura(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.TURA;
    }
}
