package com.nicopaez.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by nicopaez on 9/3/16.
 */
public class SlideDeck {

    private final String name;
    private final String templateDir;

    public SlideDeck(String slideDeckName, String templateDir) {
        this.name = slideDeckName;
        this.templateDir = templateDir;
    }

    public void save() throws IOException {
        // copy templateDir name
        String basePath = System.getProperty("user.dir");
        File srcDir = new File(basePath + "/" + this.templateDir);
        File destDir = new File(basePath + "/" + this.name);
        FileUtils.copyDirectory(srcDir, destDir);
    }
}
