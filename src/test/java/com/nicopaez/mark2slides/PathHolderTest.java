package com.nicopaez.mark2slides;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by nicopaez on 6/26/16.
 */
public class PathHolderTest {

    @Test
    public void shouldGetTargetPath() {
        System.setProperty("user.dir", "/user/john");
        PathHolder pathHolder = new PathHolder();
        String folderName = "presentation1";
        String actualPath = pathHolder.getTargetPath(folderName);
        assertThat(actualPath, is(equalTo("/user/john/presentation1")));
    }

    @Test
    public void shouldGetInputPath() {
        System.setProperty("user.dir", "/user/john");
        PathHolder pathHolder = new PathHolder();
        String fileName = "presentation1.md";
        String actualPath = pathHolder.getInputPath(fileName);
        assertThat(actualPath, is(equalTo("/user/john/presentation1.md")));
    }

    @Test
    public void shouldGetTemplatePath() {
        PathHolder pathHolder = new PathHolder();
        String actualPath = pathHolder.getTemplatePath();
        String expectedPath = System.getProperty("user.dir") + "/template";
        assertThat(actualPath, is(equalTo(expectedPath)));
    }

}
