package com.nicopaez.mark2slides;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nicopaez on 11/20/16.
 */
public class ImageElementTest {

    @Test
    public void shouldToHtml() {
        Element e = new ImageElement("picture.png");
        assertThat(e.toHtml(), is("<img src='picture.png' />"));
    }
}
