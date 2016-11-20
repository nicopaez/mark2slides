package com.nicopaez.mark2slides;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 11/19/16.
 */
public class RootElement extends Element {

    private List<Element> elements;

    public RootElement() {
        this.elements = new ArrayList<Element>();
    }

    @Override
    public String toHtml() {
        String result = "<div>[content]</div>";
        String content = "";
        for(Element e : this.elements) {
            content += e.toHtml();
        }
        return result.replace("[content]", content);
    }

    @Override
    public void addChild(Element e) {
        this.elements.add(e);
    }

}
