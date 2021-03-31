package tabla;


@SuppressWarnings("unused")
public class Move {
    private Piece piece;
    private Patratel dest;

    public Move(Piece piece, Patratel dest) {
        this.piece = piece;
        this.dest = dest;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Patratel getDest() {
        return dest;
    }

    public void setDest(Patratel dest) {
        this.dest = dest;
    }

}
