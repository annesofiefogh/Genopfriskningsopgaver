package com.company;

public class Square {

    public String pattern (int number, String sign){
        String line = "";
        String square = "";
        for (int i = 0; i < number; i++) {
            line += " " + sign + " ";
        }
        for (int j = 0; j < number; j++) {
            square += "\n" + line;
        }
        return square;
    }


    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq.pattern(6, "^"));
    }
}
