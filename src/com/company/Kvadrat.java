package com.company;

public class Kvadrat {

    public String pattern (int number, String tegn){
        String line = "";
        String kvadrat = "";
        for (int i = 0; i < number; i++) {
            line += " " + tegn + " ";
        }
        for (int j = 0; j < number; j++) {
            kvadrat += "\n" + line;
        }
        return kvadrat;
    }


    public static void main(String[] args) {
        Kvadrat kv = new Kvadrat();
        System.out.println(kv.pattern(6, "^"));
    }

}
