package com.edu.longs;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("./example.in");
        // File data = new File("./longsmall.in");
        Scanner sc = new Scanner(data);
        //
        int tests = sc.nextInt();
        //
        for (int t = 0; t < tests; t++) {
            //int n = In.readInt(); // length of A
            int n = sc.nextInt();
            //
            int[] A = new int[n]; // A
            for (int i = 0; i < n; i++) {
                //A[i] = In.readInt();
                A[i] = sc.nextInt();
            }
            //Out.println(getLongestSubsequence(n, A));
            System.out.println("result = " + getLongestSubsequence(n, A));
        }
        sc.close();
    }

    public static int getLongestSubsequence(int n, int[] a) {
        int maxLen = 0;
        for (int i = 0; i < a.length - maxLen; i++) {
            int curLen = 1;
            int current = a[i];
            for (int j = i + 1; j < a.length; j++) {
                for (int k = 1; k < (1 << 5); k *= 2) {
                    if ((a[j] == current + k) || (a[j] == Math.abs(current - k))) {
                        current = a[j];
                        curLen++;
                        break;
                    }
                }
            }
            if (maxLen < curLen) {
                maxLen = curLen;
            }
        }
        return maxLen;
    }
}
