package com.evghenii.model;

import com.evghenii.exception.RezeptExtension;

import java.util.Objects;

public class Artikle extends Common {
    private String tittel;

    public Artikle() {
    }

    public Artikle(String tittel) throws RezeptExtension {
        if (tittel.length() == 0) throw new RezeptExtension(RezeptExtension.Rezept_Empty);
        this.tittel = tittel;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    @Override
    public String toString() {
        return "Artikle{" +
                "tittel='" + tittel + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikle artikle = (Artikle) o;
        return Objects.equals(tittel, artikle.tittel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tittel);
    }


    public String getValueFromComboBox(){
        return tittel;
    }




}
