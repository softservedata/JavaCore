package com.edu05;

import java.util.Scanner;

public class AppLim {

    public double limE(double eps) {
        double a = 1;
        double a0 = 0;
        double x = 0;
        int k = 1;
        do {
            a0 = a;
            k++;
            x = 1 + 1.0 / k;
            a = 1;
            for (int i = 0; i < k; i++) {
                a = a * x;
            }
        } while (Math.abs(a - a0) > eps);
        return a;
    }

    public double myExp(double x, double eps) {
        double sum = 1;
        double p = 1;
        double f = 1;
        int i = 1;
        double a = 1;
        //
        //for (int i = 1; i <= n; i++)
        do {
            p = p * x;
            f = f * i;
            a = p / f;
            sum = sum + a;
            i++;
        } while (Math.abs(a) > eps);
        return sum;
    }

    public static void main(String[] args) {
        AppLim app = new AppLim();
        double eps = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("eps = ");
            eps = sc.nextDouble();
        } while (eps < 0);
        //
        System.out.println("recInsert = " + app.limE(eps));
        System.out.println("app.myExp = " + app.myExp(1, eps));
        System.out.println("   exp(1) = " + Math.exp(1));
        //
        sc.close();
    }
}
