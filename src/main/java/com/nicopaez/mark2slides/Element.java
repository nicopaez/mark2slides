package com.nicopaez.mark2slides;

/**
 * Created by nicopaez on 11/19/16.
 */
public abstract class Element {

    public abstract String toHtml();

    public abstract void addChild(Element e);
}
