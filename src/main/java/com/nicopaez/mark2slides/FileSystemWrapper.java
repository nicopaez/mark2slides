package com.nicopaez.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by nicopaez on 9/3/16.
 */
public class FileSystemWrapper implements FileSystem {

    @Override
    public void copyDirectory(String srcDirName, String destDirName) throws IOException {
        File srcDir = new File(srcDirName);
        File destDir = new File(destDirName);
        FileUtils.copyDirectory(srcDir, destDir);
    }
}
