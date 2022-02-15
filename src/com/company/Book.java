package com.company;

public class Book {

    private String ISBN;
    private String title;
    private int yearOfPublication;

    public Book(String ISBN, String title, int yearOfPublication) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitel() {
        return title;
    }
    public void setTitel(String titel) {
        this.title = titel;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString(){
        return "Book " + "[" + title + "]" + " – ISBN " + "[" + ISBN + "]" + " – Year of publication " + "[" + yearOfPublication + "]";
    }
}
