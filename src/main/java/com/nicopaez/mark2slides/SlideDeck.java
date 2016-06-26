package com.nicopaez.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by nicopaez on 6/26/16.
 */
public class SlideDeck {
    private final PathHolder pathHolder;
    private final FileService fileService;
    private String name;

    public SlideDeck(String rawName, PathHolder pathHolder, FileService fileService) {
        this.pathHolder = pathHolder;
        this.fileService = fileService;
        this.name = rawName;
    }

    public void save() {
        String sourceDir = pathHolder.getTemplatePath();
        String destDir = pathHolder.getTargetPath(this.name);
        fileService.copyDirectory(sourceDir, destDir);
    }
}
