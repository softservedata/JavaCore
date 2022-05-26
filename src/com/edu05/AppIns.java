package com.edu05;

import java.util.Scanner;

public class AppIns {

    public double recInsert(int n) {
        double res = 0;
        for (int i = n; i > 0; i--) {
            res = Math.sqrt(i + res);
        }
        return res;
    }

    public double rec(int i, int n) {
        if (i >= n) {
            return Math.sqrt(n);
        }
        return Math.sqrt(i + rec(i + 1, n));
    }

    public double recDivInsert(int n) {
        double res = 0;
        for (int i = 2; i <= n; i++) {
            res = i + 1 / res;
        }
        return res;
    }

    public double recDiv(int n) {
        if (n == 1) {
            return 1;
        }
        return n + 1/recDiv(n-1);
    }

    public static void main(String[] args) {
        AppIns app = new AppIns();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n = ");
            n = sc.nextInt();
        } while (n < 1);
        //
        System.out.println("recInsert = " + app.recInsert(n));
        System.out.println("      rec = " + app.rec(1, n));
        //
        System.out.println("recDivInsert = " + app.recDivInsert(n));
        System.out.println("      recDiv = " + app.recDiv(n));
        //
        sc.close();
    }
}
