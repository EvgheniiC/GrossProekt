package com.evghenii.model;

import java.util.ArrayList;
import java.util.List;

public class Ingridient extends  Common{
    private List<String> ingridientList;
    private String name;
    private EdIzmerenia edIzmerenia;

    public Ingridient(String name, EdIzmerenia edIzmerenia) {
        this.name = name;
        this.edIzmerenia = edIzmerenia;
    }

    public void addIngridient(String ingridient){
        ingridientList.add(ingridient);
    }
    public void removeIngridient(String ingridient){
        ingridientList.remove(ingridient);
    }
}
