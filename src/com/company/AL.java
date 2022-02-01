package com.company;

import java.util.ArrayList;

public class AL {

     public boolean doesArraylistContainString(ArrayList<String> list, String s){
         if(!list.contains(s)){
             list.add(s);
             return false;
         } else {
             System.out.println("The String has been found!");
             return true;
         }
     }


    public static void main(String[] args) {
        AL arr = new AL();

        ArrayList<String> listToCheck = new ArrayList<>();
        listToCheck.add("Horse");
        listToCheck.add("Dog");
        listToCheck.add("Sheep");
        System.out.println(arr.doesArraylistContainString(listToCheck, "Sheep"));
    }
}
