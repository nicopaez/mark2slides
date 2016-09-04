package com.nicopaez.mark2slides;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

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

    @Override
    public String readFileAsString(String fileName) throws IOException {
        File f = new File(fileName);
        return FileUtils.readFileToString(f, Charset.defaultCharset());
    }

    @Override
    public void writeStringToFile(String content, String contentFileName) throws IOException {
        File f = new File(contentFileName);
        FileUtils.writeStringToFile(f,content,Charset.defaultCharset());
    }
}
