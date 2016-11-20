package com.nicopaez.mark2slides;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 11/20/16.
 */
public class ElementFactory {

    List<ElementBuilder> builders;

    public ElementFactory() {
        this.builders = new ArrayList<ElementBuilder>();
    }

    public Element createElement(String line) {
        for(ElementBuilder builder : builders) {
            Element newElement = builder.build(line);
            if (newElement != null) {
                return newElement;
            }
        }
        return new UnknownElement(line);
    }

    public void addElement(ElementBuilder builder) {
        this.builders.add(builder);
    }

    public void initializeWithDefaultBuilders() {
        this.addElement(H2Element.getBuilder());
        this.addElement(H1Element.getBuilder());
        this.addElement(ImageElement.getBuilder());
    }
}
