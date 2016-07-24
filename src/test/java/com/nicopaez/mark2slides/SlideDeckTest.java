package com.nicopaez.mark2slides;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import java.io.File;
import java.io.IOException;

import static org.mockito.Matchers.anyString;

/**
 * Created by nicopaez on 6/26/16.
 */
public class SlideDeckTest {

    @Test
    public void saveShouldCreateFiles() {
        FileService fileService = Mockito.mock(FileService.class);
        SlideDeck deck = new SlideDeck("miDeck",new PathHolder(), fileService);
        deck.save();
        Mockito.verify(fileService).copyDirectory(anyString(),anyString());
    }

    @Test
    public void shouldReadSource() {
        FileService fileService = Mockito.mock(FileService.class);
        SlideDeck deck = new SlideDeck("miDeck",new PathHolder(), fileService);

        //Mockito.verify(fileService).getInputFile();

    }
}
