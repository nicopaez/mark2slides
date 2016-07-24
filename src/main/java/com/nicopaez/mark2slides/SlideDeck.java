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
    private final File inputFile;
    private String name;

    public SlideDeck(String fileName, PathHolder pathHolder, FileService fileService) {
        this.pathHolder = pathHolder;
        this.fileService = fileService;
        this.name = fileName;
        String filePath = pathHolder.getInputPath(fileName);
        this.inputFile = this.fileService.getFile(filePath);
    }

    public void save() {
        String sourceDir = pathHolder.getTemplatePath();
        String destDir = pathHolder.getTargetPath(this.name);
        fileService.copyDirectory(sourceDir, destDir);
    }
}
