package com.evghenii.exception;

import com.evghenii.text.Text;

public class RezeptExtension extends Exception  {

    public static final int Rezept_Exist = 1;
    public static final int Rezept_Empty = 2;
    public static final int Rezept_Date_Format = 3;
    public static final int Rezept_Unkorrekt_Liter = 4;
    public static final int Rezept_Unkorrekt_Gram = 5;
    public static final int Rezept_Unkorrekt_Loffel = 6;
    public static final int Rezept_Unkorrekt_Ingridient = 7;
    public static final int Rezept_Unkorrekt_StuckAnzahl = 8;



    private  int count;

    public RezeptExtension(int count) {
        this.count = count;
    }

    public String getMessege(){
        switch (count){
            case Rezept_Exist:
                return Text.get("ERROR__Exist");
            case Rezept_Empty:
                return Text.get("ERROR_is_Empty");
            case Rezept_Date_Format:
                return Text.get("ERROR__Date_Format");
            case Rezept_Unkorrekt_Liter:
                return Text.get("ERROR_Unkorrekt_Liter");
            case Rezept_Unkorrekt_Gram:
                return Text.get("ERROR__Unkorrekt_Gram");
            case Rezept_Unkorrekt_Loffel:
                return Text.get("ERROR__Unkorrekt_Loffel");
            case Rezept_Unkorrekt_Ingridient:
                return Text.get("ERROR_Unkorrekt_Ingridient");
            case Rezept_Unkorrekt_StuckAnzahl:
                return Text.get("ERROR_Unkorrekt_StuckAnzahl");

        }
        return "";

    }

}
