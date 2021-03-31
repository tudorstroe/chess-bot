package tabla;

public class Move {
    private Piece piece;
    private Patratel dest;
    private boolean promoted = false;

    public Move(Piece piece, Patratel dest) {
        this.piece = piece;
        this.dest = dest;
    }

    public Move(Piece piece, Patratel dest, boolean promoted) {
        this.piece = piece;
        this.dest = dest;
        this.promoted = promoted;
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

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }
}
