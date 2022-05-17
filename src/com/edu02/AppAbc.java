package com.edu02;

import java.util.Scanner;

public class AppAbc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int t = 0;
        //
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
        //
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        System.out.println(a + ", " + b + ", " + c);
        //
        sc.close();
    }
}
