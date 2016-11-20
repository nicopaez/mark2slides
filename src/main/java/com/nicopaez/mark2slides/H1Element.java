package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/19/16.
 */
public class H1Element extends Element {

    private final String content;

    public H1Element(String content) {
        super();
        this.content = content;
    }

    @Override
    public String toHtml() {
        return "<h1>" + this.content + "</h1>";
    }

    public static ElementBuilder getBuilder() {
        return new H1ElementBuilder();
    }

    @Override
    public void addChild(Element e) {

    }

    static class H1ElementBuilder extends ElementBuilder {

        @Override
        public Element build(String line) {
            if (line.startsWith("#")) {
                String content = line.replace("#", "");
                return new H1Element(content);
            }
            return null;
        }
    }
}
