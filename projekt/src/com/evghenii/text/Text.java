package com.evghenii.text;

import java.util.HashMap;

final public class Text {
    private static HashMap<String,String> date = new HashMap<>();

    public static void init (){
        date.put("MENU-HELP","Помощь");
        date.put("MENU-Auswahl","Выбор");


        date.put("ERROR_Rezept_Exist "," schon Exestiert ");
        date.put("ERROR_Rezept_Empty "," ist Leer ");
        date.put("ERROR_Rezept_Date_Format ","Falsche Data ");
        date.put("ERROR_Rezept_Unkorrekt_Liter","Unkorrektes Eingabe Liter ");
        date.put("ERROR_Rezept_Unkorrekt_Gram ","Unkorrektes Eingabe Gramm ");
        date.put("ERROR_Rezept_Unkorrekt_Loffel ","Unkorrektes Eingabe Loffel ");
        date.put("ERROR_Rezept_Unkorrekt_Ingridient ","Unkorrektes Eingabe Ingridient ");




    }





    public static String get(String key){
       return date.get(key);
    }


    public  static String[] getMonths(){
        String [] monts = new String[12];

        monts [0] = get("January");
        monts [1] = get("Februar");
        monts [2] = get("Marz");
        monts [3] = get("April");
        monts [4] = get("Mai");
        monts [5] = get("Juni");
        monts [6] = get("Juli");
        monts [7] = get("August");
        monts [8] = get("September");
        monts [9] = get("Oktober");
        monts [10] = get("November");
        monts [11] = get("December");




        return monts;

    }


}
