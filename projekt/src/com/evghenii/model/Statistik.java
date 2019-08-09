package com.evghenii.model;

import com.evghenii.saveUndload.SaveData;

public class Statistik {

    private int count = 0;
    public int anzahlAnschaunRezept(Rezept rezept){//сколько раз просмотрели рецепт

        SaveData saveData = SaveData.getInstance();

        for (Rezept r:saveData.getRezeptList()) {
            if (rezept.equals(r)){
                count++;
            }

        }
        return count;


    }

}
