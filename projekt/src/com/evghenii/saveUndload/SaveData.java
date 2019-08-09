package com.evghenii.saveUndload;

import com.evghenii.model.EdIzmerenia;
import com.evghenii.model.Ingridient;
import com.evghenii.model.Rezept;

import java.util.ArrayList;
import java.util.List;

public class SaveData {

    private static SaveData instance;//делаем этот класс PAttern Singl
    private List<Rezept> rezeptList = new ArrayList<>();
    private List<EdIzmerenia> edIzmereniaList = new ArrayList<>();
    private  List<Ingridient> ingridientList = new ArrayList<>();



    public static SaveData getInstance(){// Pattern Singl
        if (instance == null){
            instance = new SaveData();
        }
        return instance;
    }


    public List<Rezept> getRezeptList() {
        return rezeptList;
    }

    public List<EdIzmerenia> getEdIzmereniaList() {
        return edIzmereniaList;
    }

    public List<Ingridient> getIngridientList() {
        return ingridientList;
    }
}
