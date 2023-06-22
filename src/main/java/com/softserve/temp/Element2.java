package com.softserve.temp;

public class Element2 {

    private int data;
    private int index;
    private Element2 link;

    public Element2(int data, int index) {
        this.data = data;
        this.index = index;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public int getIndex() {
        return index;
    }

    public Element2 getLink() {
        return link;
    }

    public void setLink(Element2 link) {
        this.link = link;
    }
}
