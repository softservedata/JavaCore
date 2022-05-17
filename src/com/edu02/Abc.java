package com.edu02;

import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        //
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
        //
        if (a < b) {
            if (b < c) {
                System.out.println(a + ", " + b + ", " + c);
            } else if (a < c) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                System.out.println(c + ", " + a + ", " + b);
            }
        } else if (a < c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b < c) {
            System.out.println(b + ", " + c + ", " + a);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }
        sc.close();
    }
}
