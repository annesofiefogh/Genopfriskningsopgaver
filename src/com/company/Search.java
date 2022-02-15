package com.company;

import java.io.IOException;

public class Search {

    public int search(String[] array, String input) throws IOException {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(input)){
             return i;
            }
        }
        throw new IOException("The word doesn't exist");
    }


    public static void main(String[] args) throws IOException {
        Search search = new Search();

        String[] words = {"Ball", "Sun", "Cake"};

        System.out.println(search.search(words, "Dog"));
    }
}
