package com.company;

import java.util.Arrays;

public class ProperCase {

    public String [] properCase(String sentence){
        String [] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(words[i].toUpperCase())){
                continue;
            } else if (words[i].length() > 3){
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
            } else if (words[i].length() <= 3){
                words[i] = words[i].toLowerCase();
            }
        }
        return words;
    }


    public static void main(String[] args) {
        ProperCase pc = new ProperCase();
        System.out.println(Arrays.toString(pc.properCase("HVALER kAn være sødE")));
    }

}
