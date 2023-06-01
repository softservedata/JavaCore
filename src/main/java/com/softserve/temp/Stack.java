package com.softserve.temp;

public class Stack {
    private final int MAX_NUMBER = 100;
    private Element[] arr;
    private int ptr;

    public Stack() {
        arr = new Element[MAX_NUMBER];
        ptr = -1;
    }

    public void push(Element element) {
        ptr = ptr + 1;
        arr[ptr] = element;
    }

    public Element pop() {
        Element result = null;
        if (!isEmpty()) {
            result = arr[ptr];
            ptr = ptr - 1;
        }
        return result;
    }

    public boolean isEmpty() {
        return ptr < 0;
    }
}
