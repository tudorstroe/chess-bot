import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();

        while (!command.contains("quit")) {
//            System.out.println("[DEBUG] "+ command);
            if (command.contains("xboard")) {
                //nimic
            }
            else if (command.contains("protover")) {
                System.out.println("feature sigint=0 san=0 myname=\"Chessers\"");
            }
            else if (command.contains("new")) {
//                System.out.println("[DEBUG] new board");
            }
            else if (command.contains("force")) {
//                System.out.println("[DEBUG] force");
            }
            else if (command.contains("go")) {
//                System.out.println("[DEBUG] go");
            }
            else if (command.contains("black")) {
//                System.out.println("[DEBUG] black");
            }
            else if (command.contains("white")) {
//                System.out.println("[DEBUG] white");
            }
            else if (isMove(command)){
//                System.out.println("[DEBUG] move " + command);
                System.out.println("move a7a5");
            }
            command = reader.readLine();
        }
    }

    private static boolean isMove(String s){
        return s.matches("[a-h][1-8][a-h][1-8]q?");
  
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
