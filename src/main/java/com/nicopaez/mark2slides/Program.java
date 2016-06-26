package com.nicopaez.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by nicopaez on 6/25/16.
 */
public class Program {

    public static final void main(String[] args) {

        System.out.println("Mark2Slides, welcome!");

        PathHolder pathHolder = new PathHolder();
        SlideDeck slideDeck = new SlideDeck(args[0],pathHolder, new FileServiceImpl());
        slideDeck.save();

    }
}
