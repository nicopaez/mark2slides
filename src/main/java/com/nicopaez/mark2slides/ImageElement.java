package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/20/16.
 */
public class ImageElement extends Element{

    private final String content;

    public ImageElement(String content) {
        super();
        this.content = content;
    }

    public static ElementBuilder getBuilder() {
        return new ImageElementBuilder();
    }

    @Override
    public String toHtml() {
        return "<img src='" + this.content + "' />";
    }

    @Override
    public void addChild(Element e) {

    }

    static class ImageElementBuilder extends ElementBuilder {

        @Override
        public Element build(String line) {
            if (line.startsWith("i:")) {
                String content = line.replace("i:", "");
                return new ImageElement(content);
            }
            return null;
        }

    }
}
