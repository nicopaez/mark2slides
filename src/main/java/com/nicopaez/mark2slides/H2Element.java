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

    @Override
    public String toHtml() {
        return "<h2>" + this.content + "</h2>";
    }

    @Override
    public void addChild(Element e) {

    }

}
