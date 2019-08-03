package com.evghenii.main;

import com.evghenii.text.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Rezept {
    public static void main(String[] args) {
     init();
        System.out.println(Text.get("Menu-HELP"));
    }

    private static void init(){
        Text.init();
        GraphicsEnvironment graphicsEnvironment =  GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            graphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT,new File("fonts/17574.ttf")));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }


    }





}
