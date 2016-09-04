package com.nicopaez.mark2slides;

import java.io.IOException;

/**
 * Created by nicopaez on 9/3/16.
 */
public class FakeFileSystem implements FileSystem {

    private boolean wasCalled = false;
    private String fileContent;

    @Override
    public void copyDirectory(String srcDirName, String destDirName) throws IOException {
        this.wasCalled = true;
    }

    @Override
    public String readFileAsString(String fileName) {
        return "[title]";
    }

    @Override
    public void writeStringToFile(String content, String contentFileName) {
        this.fileContent = content;
    }

    public boolean copyDirectoryWasCall() {
        return this.wasCalled;
    }

    public String getContentToWrite() {
        return this.fileContent;
    }
}
