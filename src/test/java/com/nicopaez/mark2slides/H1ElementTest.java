package com.nicopaez.mark2slides;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nicopaez on 11/20/16.
 */
public class H1ElementTest {

    @Test
    public void shouldToHtml() {
        Element e = new H1Element("# title 1");
        assertThat(e.toHtml(), is("<h1> title 1</h1>"));
    }
}
