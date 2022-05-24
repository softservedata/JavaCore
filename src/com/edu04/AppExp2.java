package com.edu04;

import java.util.Scanner;

public class AppExp2 {
    private Scanner sc; // sc = null; by default

    public AppExp2() {
        sc = new Scanner(System.in);
    }

    public void scClose() {
        if (sc != null) {
            sc.close();
        }
        sc = null;
    }

    public int scReadInt(String message) {
        int result = 0;
        if (sc != null) {
            System.out.print(message + " ");
            result = sc.nextInt();
        }
        return result;
    }

    public double scReadDouble(String message) {
        double result = 0;
        if (sc != null) {
            System.out.print(message + " ");
            result = sc.nextDouble();
        }
        return result;
    }

    public void scPrint(String message, Object element) {
        System.out.print(message + " " + element);
    }

    public double myExp(double x, int n) {
        double sum = 1;
        double p = 1;
        double f = 1;
        for (int i = 1; i <= n; i++) {
            p = p * x;
            f = f * i;
            sum = sum + p / f;
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        //
        byte b = 127;
        b = (byte) (b + 1);
        System.out.println("b = " + b);
        int i = b;
        System.out.println("1. i = " + i);
        i = 0x000000FF & i;
        System.out.println("2. i = " + i);
        //
        b = 48;
        System.out.println("b = " + b);
        System.out.println("(char) b = " + (char) b);
        //
        System.out.print("0123456789");
        Thread.sleep(4000);
        System.out.print(((char) 13) + "ABCD");
        //
        AppExp2 app = new AppExp2();
        app.scPrint("my exp = ",
                app.myExp(app.scReadDouble("\nx = "), app.scReadInt("n = "))
        );
        app.scClose();
    }
}
