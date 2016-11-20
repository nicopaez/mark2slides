package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/20/16.
 */
public class H1ElementBuilder extends ElementBuilder {

    @Override
    public Element build(String line) {
        if (line.startsWith("#")) {
            String content = line.replace("#", "");
            return new H1Element(content);
        }
        return null;
    }
}
