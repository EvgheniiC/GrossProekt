package com.evghenii.model;


import java.util.List;

public abstract class EdIzmerenia extends Common {
    private List<String> edIzmerenias;
    private String tittle;
    private int stuckAnzahl;

    public void addEdIzmer(String name){
        edIzmerenias.add(name);

    }



}


