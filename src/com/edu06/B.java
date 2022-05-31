package com.edu06;

public class B extends A {

    public B() {
        // super(); // by default
        System.out.println("\tConstructor public B()");
    }

    public B(int i) {
        super(i);
        System.out.println("\tConstructor public B(int i)");
    }

    @Override
    public void m1() {
        System.out.println("\tDone Class B: public void m1()");
        super.m1();
    }

    public static void m2() {
        System.out.println("\tDone Class B: public STATIC void m2()");
    }
}
