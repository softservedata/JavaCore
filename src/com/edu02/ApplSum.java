package com.edu02;

import java.util.Scanner;

public class ApplSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        //
        System.out.print("n = ");
        n = sc.nextInt();
        //
        for (int i = 0; i < n; i++) {
            sum = sum + (i + 1);
        }
        System.out.println("sum = " + sum);
        sc.close();
    }

}
