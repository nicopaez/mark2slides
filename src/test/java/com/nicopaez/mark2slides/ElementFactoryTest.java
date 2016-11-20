package com.nicopaez.mark2slides;

import org.junit.Before;
import org.junit.Test;

import static java.util.function.Predicate.isEqual;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nicopaez on 11/20/16.
 */
public class ElementFactoryTest {

    private ElementFactory factory;

    @Before
    public void before() {
        factory = new ElementFactory();
        factory.initializeWithDefaultBuilders();
    }

    @Test
    public void shouldCreateH1() {
        Element e =  factory.createElement("# title 1");
        assert(e.getClass().equals(H1Element.class));
    }

    @Test
    public void shouldCreateH2() {
        Element e =  factory.createElement("## title 2");
        assert(e.getClass().equals(H2Element.class));
    }

}
