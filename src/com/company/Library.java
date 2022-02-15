package com.company;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
      books.add(new Book("1234", "Harry Potter", 2001));
      books.add(new Book("5678", "Earth, Wind and Fire", 1988));
      books.add(new Book("7890", "Chemistry", 2020));
    }

    public boolean isTheBookInTheLibrary(Book bog){
        for (Book b : books) {
           if(b.getISBN().equals(bog.getISBN())){
                return true;
           }
        }
        return false;
    }


    public static void main(String[] args) {
        Book book = new Book("8456", "Pippi", 2000);
        Library library = new Library();
        System.out.println(library.isTheBookInTheLibrary(book));
    }
}
