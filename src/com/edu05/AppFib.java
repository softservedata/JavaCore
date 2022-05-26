package com.edu05;

import java.util.Scanner;

public class AppFib {

    public int fibonachi(int n) {
        int f = 1;
        int f0 = 1;
        int f1 = 1;
        //
        for (int i = 2; i <= n; i++) {
            f0 = f1;
            f1 = f;
            f = f0 + f1;
        }
        return f;
    }

    public int recfibon(int n) {
        if (n <= 1) {
            return 1;
        }
        return recfibon(n - 1) + recfibon(n - 2);
    }

    public static void main(String[] args) {
        AppFib app = new AppFib();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n = ");
            n = sc.nextInt();
        } while (n < 0);
        //
        System.out.println("recInsert = " + app.fibonachi(n));
        System.out.println("recfibon  = " + app.recfibon(n));
        //
        sc.close();
    }
}
