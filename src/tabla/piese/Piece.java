package tabla.piese;

import tabla.Patratel;
import tabla.PlayerColor;

public class Piece {
    protected Patratel patratel;
    protected boolean moved = false;
    protected PieceType type;
    protected PlayerColor color;

    public Piece(Patratel patratel, PlayerColor color) {
        this.patratel = patratel;
        this.color = color;
    }

    public Patratel getPatratel() {
        return patratel;
    }

    public void setPatratel(Patratel patratel) {
        this.patratel = patratel;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public PlayerColor getColor() {
        return color;
    }

    public void setColor(PlayerColor color) {
        this.color = color;
    }
}
