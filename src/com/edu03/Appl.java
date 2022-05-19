package com.edu03;

public class Appl {

    public long fn1(int n) {
        long f = 1L;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public long fn(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fn(n - 1);
    }

    public static void main(String[] args) {
        Appl app = new Appl();
        //
        int n = 5;
        System.out.println(n + "! = " + app.fn1(n));
        System.out.println(n + "! = " + app.fn(n));
    }
}
