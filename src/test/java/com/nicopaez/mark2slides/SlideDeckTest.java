package com.nicopaez.mark2slides;

import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.contains;

/**
 * Created by nicopaez on 9/3/16.
 */
public class SlideDeckTest {

    @Test
    public void SaveShouldCreateFolderFotSlide() throws IOException {
        // arrange
        FakeFileSystem fs = new FakeFileSystem();
        SlideDeck slideDeck = new SlideDeck("mydeck1", "templateDir", fs);

        // act
        slideDeck.save();

        // assert
        assertTrue(fs.copyDirectoryWasCall());
    }

    @Test
    public void shouldSetTitle() throws IOException {
        // arrange
        FakeFileSystem fs = new FakeFileSystem();
        SlideDeck slideDeck = new SlideDeck("mydeck1", "templateDir", fs);

        // act
        slideDeck.save();

        // assert
        assertTrue(fs.copyDirectoryWasCall());
        assertTrue(fs.getContentToWrite().contains("mydeck1"));
    }

    @Test
    public void shouldReturnARootElement() throws IOException {
        FileSystem fs = Mockito.mock(FileSystem.class);
        Mockito.when(fs.readFileAsString("mydeck1.md")).thenReturn("#title 1\r##title2");
        SlideDeck slideDeck = new SlideDeck("mydeck1", "templateDir", fs);
        Element element = slideDeck.getRootElement();
        assertNotNull(element);
    }

}
