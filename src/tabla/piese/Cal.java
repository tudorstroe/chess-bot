package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Cal extends Piece{
    public Cal(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.CAL;
    }
}
