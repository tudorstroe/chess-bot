package tabla.factory_moves;

import tabla.Move;
import tabla.Patratel;
import tabla.PlayerColor;
import tabla.Tabla;

import java.util.ArrayList;

public class MoveRegina implements MoveStrategy {
    public MoveRegina() {
    }

    @Override
    public ArrayList<Move> getMoves(Patratel curr, Tabla tabla) {
        ArrayList<Move> result = new ArrayList<>();
        int x = curr.getX();
        int y = curr.getY();


        if (curr.getPiece().getColor() == PlayerColor.WHITE) {


            for(int i=0; i<=7; i++) {
                if(y<(7-i) && x<(7-i) && (!tabla.getTabla()[x+1+i][y+1+i].hasPiece() || tabla.getTabla()[x+1+i][y + 1 + i].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;

                    for(int j=1; j<=i; j++) {

                        if (tabla.getTabla()[x + j][y + j].hasPiece()) {
                            semafor = 1;
                            break;
                        }
//                            if (tabla.getTabla()[x + j][y + j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }


                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y + (1 + i)]));
                    } // else
//                    if(tabla.getTabla()[x + (1 + i)][y + (1 + i)] !=null) {
//
//                        if (tabla.getTabla()[x + (1 + i)][y + (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                            result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y + (1 + i)]));
//                        }
//                    }
                }
                if(x>0+i && y<(7-i) && ( !tabla.getTabla()[x-(1+i)][y+(1+i)].hasPiece() || tabla.getTabla()[x-(1+i)][y + 1 + i].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if (tabla.getTabla()[x - j][y + j].hasPiece()) {
                            semafor = 1;
                            break;
//                            if (tabla.getTabla()[x - j][y + j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }
                        }
                    }
                    if(semafor==0 ) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y + (1 + i)]));
                    } // else
//                    if(tabla.getTabla()[x - (1 + i)][y + (1 + i)] !=null) {
//
//                        if (tabla.getTabla()[x - (1 + i)][y + (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                            result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y + (1 + i)]));
//                        }
//                    }
                }

                if(x>0+i && y>0+i && ( !tabla.getTabla()[x-(1+i)][y-(1+i)].hasPiece() || tabla.getTabla()[x-(1+i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;

                    for(int j=1; j<=i; j++) {
                        if (tabla.getTabla()[x - j][y - j].hasPiece()) {
                            semafor = 1;
                            break;

//                            if (tabla.getTabla()[x - j][y - j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }
                        }
                    }
                    if(semafor==0 ) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y - (1 + i)]));
                    } // else
//                    if(tabla.getTabla()[x - (1 + i)][y - (1 + i)] !=null) {
//
//                        if (tabla.getTabla()[x - (1 + i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                            result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y - (1 + i)]));
//
//                        }
//                    }
                }
                if(x<(7-i) && y>0+i && ( !tabla.getTabla()[x+(1+i)][y-(1+i)].hasPiece() || tabla.getTabla()[x+(1+i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor = 0;
                    for (int j = 1; j <=i; j++) {
                        if(tabla.getTabla()[x+j][y-j].hasPiece()) {
                            semafor = 1;
                            break;

//                            if (tabla.getTabla()[x + j][y - j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }
                        }
                    }
                    if (semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y - (1 + i)]));
                    } // else
//                        if(tabla.getTabla()[x + (1 + i)][y - (1 + i)] !=null) {
//                            if(tabla.getTabla()[x + (1 + i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y - (1 + i)]));
//                        }
//                    }
                }
                if(x<(7-i) && ( !tabla.getTabla()[x+1+i][y].hasPiece() || tabla.getTabla()[x+(1+i)][y].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x+j][y].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y]));
                    }
                }
                if(x>0+i && ( !tabla.getTabla()[x-(1+i)][y].hasPiece() || tabla.getTabla()[x-(1+i)][y].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x-j][y].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y]));
                    }
                }

                if(y>0+i && ( !tabla.getTabla()[x][y-(1+i)].hasPiece() || tabla.getTabla()[x][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x][y-j].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y - (1 + i)]));
                    }
                }
                if(y<(7-i) && ( !tabla.getTabla()[x][y+(1+i)].hasPiece() || tabla.getTabla()[x][y + (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x][y+j].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if (semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y + (1 + i)]));
                    }
                }
            }
        }

        if (curr.getPiece().getColor() == PlayerColor.BLACK) {


            for(int i=0; i<=7; i++) {
                if(y<(7-i) && x<(7-i) && (!tabla.getTabla()[x+1+i][y+1+i].hasPiece() || tabla.getTabla()[x+1+i][y + 1 + i].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;

                    for(int j=1; j<=i; j++) {

                        if (tabla.getTabla()[x + j][y + j].hasPiece()) {
                            semafor = 1;
                            break;
                        }
//                            if (tabla.getTabla()[x + j][y + j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }


                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y + (1 + i)]));
                    } // else
//                    if(tabla.getTabla()[x + (1 + i)][y + (1 + i)] !=null) {
//
//                        if (tabla.getTabla()[x + (1 + i)][y + (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                            result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y + (1 + i)]));
//                        }
//                    }
                }
                if(x>0+i && y<(7-i) && ( !tabla.getTabla()[x-(1+i)][y+(1+i)].hasPiece() || tabla.getTabla()[x-(1+i)][y + 1 + i].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if (tabla.getTabla()[x - j][y + j].hasPiece()) {
                            semafor = 1;
                            break;
//                            if (tabla.getTabla()[x - j][y + j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }
                        }
                    }
                    if(semafor==0 ) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y + (1 + i)]));
                    } // else
//                    if(tabla.getTabla()[x - (1 + i)][y + (1 + i)] !=null) {
//
//                        if (tabla.getTabla()[x - (1 + i)][y + (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                            result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y + (1 + i)]));
//                        }
//                    }
                }

                if(x>0+i && y>0+i && ( !tabla.getTabla()[x-(1+i)][y-(1+i)].hasPiece() || tabla.getTabla()[x-(1+i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;

                    for(int j=1; j<=i; j++) {
                        if (tabla.getTabla()[x - j][y - j].hasPiece()) {
                            semafor = 1;
                            break;

//                            if (tabla.getTabla()[x - j][y - j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }
                        }
                    }
                    if(semafor==0 ) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y - (1 + i)]));
                    } // else
//                    if(tabla.getTabla()[x - (1 + i)][y - (1 + i)] !=null) {
//
//                        if (tabla.getTabla()[x - (1 + i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                            result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y - (1 + i)]));
//
//                        }
//                    }
                }
                if(x<(7-i) && y>0+i && ( !tabla.getTabla()[x+(1+i)][y-(1+i)].hasPiece() || tabla.getTabla()[x+(1+i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor = 0;
                    for (int j = 1; j <=i; j++) {
                        if(tabla.getTabla()[x+j][y-j].hasPiece()) {
                            semafor = 1;
                            break;

//                            if (tabla.getTabla()[x + j][y - j].getPiece().getColor() != curr.getPiece().getColor()) {
//                                semafor = 2;
//                                counter++;
//                                break;
//                            }
                        }
                    }
                    if (semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y - (1 + i)]));
                    } // else
//                        if(tabla.getTabla()[x + (1 + i)][y - (1 + i)] !=null) {
//                            if(tabla.getTabla()[x + (1 + i)][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor() && counter == 1) {
//                                result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y - (1 + i)]));
//                        }
//                    }
                }
                if(x<(7-i) && ( !tabla.getTabla()[x+1+i][y].hasPiece() || tabla.getTabla()[x+(1+i)][y].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x+j][y].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x + (1 + i)][y]));
                    }
                }
                if(x>0+i && ( !tabla.getTabla()[x-(1+i)][y].hasPiece() || tabla.getTabla()[x-(1+i)][y].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x-j][y].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x - (1 + i)][y]));
                    }
                }

                if(y>0+i && ( !tabla.getTabla()[x][y-(1+i)].hasPiece() || tabla.getTabla()[x][y - (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x][y-j].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if(semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y - (1 + i)]));
                    }
                }
                if(y<(7-i) && ( !tabla.getTabla()[x][y+(1+i)].hasPiece() || tabla.getTabla()[x][y + (1 + i)].getPiece().getColor() != curr.getPiece().getColor())) {
                    int semafor=0;
                    for(int j=1; j<=i; j++) {
                        if(tabla.getTabla()[x][y+j].hasPiece()) {
                            semafor = 1;
                        }
                    }
                    if (semafor==0) {
                        result.add(new Move(curr.getPiece(), tabla.getTabla()[x][y + (1 + i)]));
                    }
                }
            }
        }
        return result;
    }
}
