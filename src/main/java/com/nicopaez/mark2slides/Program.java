package com.nicopaez.mark2slides;

import java.io.IOException;

/**
 * Created by nicopaez on 9/3/16.
 */
public class Program {

    public final static void main(String args[]) {
        String slideDeckName = args[0];
        String templateDir = "template";
        System.out.println("Mark2Slide => " + slideDeckName);
        FileSystem fs = new FileSystemWrapper();
        SlideDeck slideDeck = new SlideDeck(slideDeckName, templateDir, fs);
        try {
            slideDeck.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
