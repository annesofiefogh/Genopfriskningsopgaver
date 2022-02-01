package com.company;

import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> books = new ArrayList<>();

    public Bibliotek () {
      this.books = books;
      books.add(new Bog("1234", "Hvalfangst", 1999));
      books.add(new Bog("5678", "Keramik", 2012));
      books.add(new Bog("7890", "Vandflad", 1987));
    }

    public boolean isTheBookInTheLibrary(Bog bog){
        for (Bog b : books) {
           if(b.getISBN().equals(bog.getISBN())){
                return true;
           }
        }
        return false;
    }


    public static void main(String[] args) {
        Bog bog = new Bog("8456", "Pippi", 2000);
        Bibliotek biblo = new Bibliotek();
        System.out.println(biblo.isTheBookInTheLibrary(bog));
    }
}
