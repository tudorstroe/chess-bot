package tabla.factory_moves;

import tabla.Move;
import tabla.Patratel;
import tabla.Tabla;

import java.util.ArrayList;

public class MoveRege implements MoveStrategy {
    public MoveRege() {
    }

    @Override
    public ArrayList<Move> getMoves(Patratel curr, Tabla tabla) {
        return new ArrayList<>();
    }
}
