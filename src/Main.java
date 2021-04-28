import tabla.Move;
import tabla.PlayerColor;
import tabla.Tabla;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        Tabla tabla = new Tabla();
        Random random = new Random();

        FileWriter test = new FileWriter("test.txt");
//        tabla.init();
//
//        tabla.generateMoves();
//
//        System.out.println(tabla.getMoves().size());
//
//        tabla.print();
//
//        Random random = new Random();
//
//        Move move = tabla.getMoves().get(random.nextInt(tabla.getMoves().size()));
//        printMove(move);
//        tabla.executeMove(move);
//
//        tabla.print();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();

        while (!command.contains("quit")) {
           if (command.contains("protover")) {
                System.out.println("feature sigint=0 san=0 myname=\"Chessers\"");
            } else if (command.contains("new")) {
               tabla = new Tabla();
                tabla.init();
            } else if (command.contains("force")) {
                tabla.setAbleToMove(false);
            } else if (command.contains("go")) {
                tabla.setAbleToMove(true);
                tabla.generateMoves();
                if (tabla.getMoves().size() > 0) {
                    Move move = tabla.getMoves().get(random.nextInt(tabla.getMoves().size()));
                    printMove(move);
                    tabla.executeMove(move);
                } else {
                    System.out.println("resign");
                    tabla.setAbleToMove(false);
                }
            } else if (command.contains("black")) {
                tabla.setMachine(PlayerColor.BLACK);
            } else if (command.contains("white")) {
                tabla.setMachine(PlayerColor.WHITE);
            } else if (isMove(command)) {
                tabla.update(command);

                //debug
               tabla.print(test);

                if (tabla.isAbleToMove()) {
                    tabla.generateMoves();
                    if (tabla.getMoves().size() > 0) {
                        Move move = tabla.getMoves().get(random.nextInt(tabla.getMoves().size()));
                        printMove(move);
                        tabla.executeMove(move);
                        //debug
                        tabla.print(test);
                    } else {
                        System.out.println("resign");
                        tabla.setAbleToMove(false);
                    }
                }
            }
            command = reader.readLine();
        }
    }

    private static boolean isMove(String s) {
        return s.matches("[a-h][1-8][a-h][1-8]q?");
    }

    public static void printMove(Move move) {
        String str = "move ";
        int x = move.getPiece().getPatratel().getX();
        int y = move.getPiece().getPatratel().getY();

        int newx = move.getDest().getX();
        int newy = move.getDest().getY();
        str = str + (char) ('a' + x);
        str = str + (char) ('1' + y);
        str = str + (char) ('a' + newx);
        str = str + (char) ('1' + newy);

        if (move.isPromoted()) {
            str = str + "q";
        }

        System.out.println(str);
    }

}
