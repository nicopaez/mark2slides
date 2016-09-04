package com.nicopaez.mark2slides;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

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
}
