package com.edu02;

import java.util.Scanner;

public class Applexp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        double x = 0;
        double p = 1;
        long f = 0;
        //
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("x = ");
        x = sc.nextDouble();
        //
        for (int i = 0; i <= n; i++) {
            p = 1;
            for (int j = 0; j < i; j++) {
                p = p * x;
            }
            f = 1;
            for (int j = 0; j < i; j++) {
                f = f * (j + 1);
            }
            sum = sum + p / f;
            if (f < 0) {
                System.out.println("f = " + f + "   i = " + i);
                break;
            }
        }
        System.out.println("sum = " + sum + "  exp(x) = " + Math.exp(x));
    }
}
