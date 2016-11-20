package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/20/16.
 */
public class H2ElementBuilder extends ElementBuilder {

    @Override
    public Element build(String line) {
        if (line.startsWith("##")) {
            String content = line.replace("##", "");
            return new H2Element(content);
        }
        return null;
    }

}
