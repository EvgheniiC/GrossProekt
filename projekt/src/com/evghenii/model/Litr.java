package com.evghenii.model;

public class Litr extends EdIzmerenia {
    private String litr;
    private int anzahl;

    public Litr(String litr, int anzahl) {
        this.litr = litr;
        this.anzahl = anzahl;
    }

    public String getLitr() {
        return litr;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setLitr(String litr) {
        this.litr = litr;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
