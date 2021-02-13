/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YapayZeka;

import processing.core.PApplet;

/**
 *
 * @author Kubra Batur
 */
public class HarfOyunu extends PApplet {

    public static void main(String[] args) {
        PApplet.main(new String[]{"YapayZeka.HarfOyunu"});
    }

    char[] harfler = "ABCÇDEFGĞHIİJKLMNOÖPQRSŞTUÜVWXYZ".toCharArray();
    int index = (int) random(harfler.length);

    @Override
    public void settings() {
        size(1200, 700);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        background(215, 242, 245);

        fill(24, 106, 115);
        textSize(50);
        text("HARF OYUNU", (width / 2) - 170, (height / 9));

        fill(13, 56, 61);
        textSize(250);
        text(harfler[index], (width / 2) - 100, (height / 2) + 100);

        if (keyPressed) {
            delay(1000);
        }
    }

    @Override
    public void keyPressed() {

        String deger = "";
        deger += key;
        deger = deger.toUpperCase();

        if (harfler[index] == deger.charAt(0)) {
            fill(34, 181, 81);
            textSize(100);
            text("TEBRİKLER", (width / 2) - 250, (height / 2) + 300);
            index = (int) random(harfler.length);
        } else {

            fill(222, 44, 44);
            textSize(100);
            text("Tekrar Deneyin", (width / 2) - 350, (height / 2) + 300);
        }

    }

}
