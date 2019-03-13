package com.example.ocrsystemsys;

import net.sourceforge.tess4j.*;
import net.sourceforge.tess4j.util.LoadLibs;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class TesseractExample {

    public static void main(String[] args) throws IOException {
        //File imageFile = new File("eurotext.tif");
        URL imageFile=new URL("https://2.allegroimg.com/s512/037caf/94cf42ab46b58f3f420fd275b1a2");
        BufferedImage bufferedImage= ImageIO.read(imageFile);

        ITesseract instance = new Tesseract();

        instance.setDatapath(("C:\\Users\\kamil\\Downloads"));
        instance.setLanguage("pol");
        try {
            String result = instance.doOCR(bufferedImage);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}