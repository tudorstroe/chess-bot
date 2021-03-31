import tabla.Move;
import tabla.Tabla;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tabla tabla = new Tabla();

        tabla.init();

        tabla.generateMoves();

        System.out.println(tabla.getMoves().size());

        tabla.print();

        Random random = new Random();

        Move move = tabla.getMoves().get(random.nextInt(tabla.getMoves().size()));
        printMove(move);
        tabla.executeMove(move);

        tabla.print();
    }

    public static void printMove(Move move) {
        String str = "move ";
        int x = move.getPiece().getPatratel().getX();
        int y = move.getPiece().getPatratel().getY();

        int newx = move.getDest().getX();
        int newy = move.getDest().getY();
        str = str + (char) ('a' + x);
        str = str + (char) ('0' + y);
        str = str + (char) ('a' + newx);
        str = str + (char) ('0' + newy);

        if (move.isPromoted()){
            str = str + "q";
        }

        System.out.println(str);
    }
}
