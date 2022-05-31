package com.edu06;

public class Appl {

    public static void main(String[] args) {
        //B b = new B(456);
        A b = new B(456);
        System.out.println("b.i  = " + b.getI());
        b.m1();
        b.m2(); // A.m2();
    }
}
