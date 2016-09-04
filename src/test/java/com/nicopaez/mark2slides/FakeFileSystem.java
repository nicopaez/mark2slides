package com.nicopaez.mark2slides;

import java.io.IOException;

/**
 * Created by nicopaez on 9/3/16.
 */
public class FakeFileSystem implements FileSystem {

    private boolean wasCalled = false;
    @Override
    public void copyDirectory(String srcDirName, String destDirName) throws IOException {
        this.wasCalled = true;
    }

    public boolean copyDirectoryWasCall() {
        return this.wasCalled;
    }
}
