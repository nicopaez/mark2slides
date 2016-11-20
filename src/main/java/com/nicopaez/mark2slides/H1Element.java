package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/19/16.
 */
public class H1Element extends Element {

    private final String content;

    public H1Element(String line) {
        super();
        this.content = line.replace("#", "");
    }

    @Override
    public String toHtml() {
        return "<h1>" + this.content + "</h1>";
    }

    public static ElementBuilder getBuilder() {
        return builder;
    }

    protected static ElementBuilder builder = new H1ElementBuilder();

    @Override
    public void addChild(Element e) {

    }
}
