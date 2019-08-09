package com.evghenii.model;

public class Loffel extends EdIzmerenia {
    private String loffek;
    private int anzahl;

    public Loffel(String loffek, int anzahl) {
        this.loffek = loffek;
        this.anzahl = anzahl;
    }

    public String getLoffek() {
        return loffek;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setLoffek(String loffek) {
        this.loffek = loffek;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
