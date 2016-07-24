package com.nicopaez.mark2slides;

import java.io.File;

/**
 * Created by nicopaez on 6/26/16.
 */
public interface FileService {

    public void copyDirectory(String sourcePath, String destPath);

    File getFile(String filePath);
}
