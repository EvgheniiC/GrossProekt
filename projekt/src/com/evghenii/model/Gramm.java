package com.evghenii.model;

public class Gramm extends EdIzmerenia {
    private String gramm;
    private int anzahl;

    public Gramm(String gramm, int anzahl) {
        this.gramm = gramm;
        this.anzahl = anzahl;
    }

    public String getGramm() {
        return gramm;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setGramm(String gramm) {
        this.gramm = gramm;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
