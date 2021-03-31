package tabla.factory_moves;

import tabla.Move;
import tabla.Patratel;
import tabla.Tabla;

import java.util.ArrayList;


public interface MoveStrategy {

    ArrayList<Move> getMoves(Patratel curr, Tabla tabla);

}
