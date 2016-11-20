package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/20/16.
 */
public class H2Element extends Element {

    private final String content;

    public H2Element(String line) {
        super();
        this.content = line.replace("##", "");
    }

    public static ElementBuilder getBuilder() {
        return new H2ElementBuilder();
    }

    @Override
    public String toHtml() {
        return "<h2>" + this.content + "</h2>";
    }

    @Override
    public void addChild(Element e) {

    }

}
