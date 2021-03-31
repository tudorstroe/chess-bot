package tabla;


public class Pion extends Piece {

    public Pion(Patratel patratel, PlayerColor color) {
        super(patratel, color);
        type = PieceType.PION;
    }

}
