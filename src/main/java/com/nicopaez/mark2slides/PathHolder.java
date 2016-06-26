package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 6/26/16.
 */
public class PathHolder {
    private String basePath;

    public PathHolder() {
        this.basePath = System.getProperty("user.dir");
    }
    public String getTargetPath(String folderName) {
        return this.basePath + "/" + folderName;
    }

    public String getTemplatePath() {
        return System.getProperty("user.dir") + "/template";
    }
}
