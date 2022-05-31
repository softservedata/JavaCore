package com.edu06;

//public class A extends Object {
public class A {
    private int i = 123;

    public A() {
        System.out.println("Constructor public A()");
    }

    public A(int i) {
        this();
        System.out.println("Constructor public A(int i)");
        this.i = i;
    }

    public int getI() {
        System.out.println("Done public int getI()");
        return i;
    }

    public void m1() {
        System.out.println("Done Class A: public void m1()");
    }

    public static void m2() {
        System.out.println("Done Class A: public STATIC void m2()");
    }
}
