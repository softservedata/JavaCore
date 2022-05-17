package com.edu01;

import java.util.Scanner;

public class Appl {
    private int i;

    public void m1() {
        System.out.println("m1() i = " + i);
    }

    public int getMax(int arg0, int arg1) {
        int max = arg0;
        if (max < arg1) {
            max = arg1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int i = 321;
        Appl app = new Appl();
        app.i = 123;
        System.out.println("app.i = " + app.i);
        Appl app2 = new Appl();
        app2.i = 456;
        System.out.println("app2.i = " + app2.i);
        //
        app.m1();
        app2.m1();
        System.out.println("i = " + i);
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("a1 = ");
        int a1 = sc.nextInt();
        System.out.print("a2 = ");
        int a2 = sc.nextInt();
        int max = app.getMax(a1, a2);
        System.out.printf("max = " + max);
        sc.close();
    }
}
