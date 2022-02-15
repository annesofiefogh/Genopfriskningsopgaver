package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type 5 words: ");

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            words.add(sc.nextLine());
        }
        Collections.sort(words);
        Collections.reverse(words);
        System.out.println(words);
    }
}
