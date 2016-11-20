package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/20/16.
 */
public class H2Element extends Element {

    private final String content;

    public H2Element(String content) {
        super();
        this.content = content;
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

    static class H2ElementBuilder extends ElementBuilder {

        @Override
        public Element build(String line) {
            if (line.startsWith("##")) {
                String content = line.replace("##", "");
                return new H2Element(content);
            }
            return null;
        }

    }
}
