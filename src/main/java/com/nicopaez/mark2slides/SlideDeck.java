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
    private final FileSystem fileSystem;

    public SlideDeck(String slideDeckName, String templateDir, FileSystem fs) {
        this.name = slideDeckName;
        this.templateDir = templateDir;
        this.fileSystem = fs;
    }

    public void save() throws IOException {
        String basePath = System.getProperty("user.dir");
        String srcDirName = basePath + "/" + this.templateDir;
        String destDirName = basePath + "/" + this.name;
        this.fileSystem.copyDirectory(srcDirName, destDirName);
    }
}
