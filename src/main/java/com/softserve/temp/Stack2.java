package com.softserve.temp;

public class Stack2 {

    private Element2 ptr;

    public Stack2() {
        ptr = null;
    }

    public void push(Element2 element) {
        element.setLink(ptr);
        ptr = element;
    }

    public Element2 pop() {
        Element2 result = null;
        if (!isEmpty()) {
            result = ptr;
            ptr = ptr.getLink();
        }
        return result;
    }

    public boolean isEmpty() {
        return ptr == null;
    }
}
