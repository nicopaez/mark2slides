package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/20/16.
 */
public class UnknownElement extends Element {

    private final String content;

    public UnknownElement(String line) {
        super();
        this.content = line;
    }

    @Override
    public String toHtml() {
        return this.content;
    }

    @Override
    public void addChild(Element e) {

    }
}
