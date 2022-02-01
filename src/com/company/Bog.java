package com.company;

public class Bog {

    private String ISBN;
    private String titel;
    private int udgivelsesår;

    public Bog(String ISBN, String titel, int udgivelsesår) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }


    public String toString(){
        return "Bogen " + "[" + titel + "]" + " – ISBN " + "[" + ISBN + "]" + " – Udgivelsesår " + "[" + udgivelsesår + "]";
    }
}
