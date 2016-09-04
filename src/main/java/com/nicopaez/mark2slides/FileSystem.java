package com.nicopaez.mark2slides;

import java.io.IOException;

/**
 * Created by nicopaez on 9/3/16.
 */
public interface FileSystem {
    void copyDirectory(String srcDirName, String destDirName) throws IOException;
}
