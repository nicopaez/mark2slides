package com.nicopaez.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by nicopaez on 6/26/16.
 */
public class FileServiceImpl implements FileService {
    @Override
    public void copyDirectory(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            FileUtils.copyDirectory(sourceFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public File getFile(String filePath) {
        return null;
    }
}
