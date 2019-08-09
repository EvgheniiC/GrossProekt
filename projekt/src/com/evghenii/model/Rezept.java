package com.evghenii.model;

import com.evghenii.exception.RezeptExtension;

import java.util.List;

public class Rezept extends Common {
    private String name;
    private List<Ingridient> ingridients;
    private List<EdIzmerenia> edIzmerenias;


    public Rezept(String name, List<Ingridient> ingridients, List<EdIzmerenia> edIzmerenias) throws RezeptExtension {
        if (name.length() == 0) throw new RezeptExtension(RezeptExtension.Rezept_Empty);
        this.name = name;
        this.ingridients = ingridients;
        this.edIzmerenias = edIzmerenias;
    }





}
