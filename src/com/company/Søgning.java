package com.company;

import java.io.IOException;

public class Søgning {

    public int search (String[] array, String s) throws IOException {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(s)){
             return i;
            }
        }
        throw new IOException("The word doesn't exist");
    }


    public static void main(String[] args) throws IOException {
        Søgning søgning = new Søgning();

        String[] words = {"bold", "sol", "kage"};

        System.out.println(søgning.search(words, "hund"));
    }


}
