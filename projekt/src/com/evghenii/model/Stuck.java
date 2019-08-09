package com.evghenii.model;

public class Stuck extends EdIzmerenia {
    private String stuckAnzahl;
    private int anzahl;

    public Stuck(String stuckAnzahl, int anzahl) {
        this.stuckAnzahl = stuckAnzahl;
        this.anzahl = anzahl;
    }

    public String getStuckAnzahl() {
        return stuckAnzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setStuckAnzahl(String stuckAnzahl) {
        this.stuckAnzahl = stuckAnzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
