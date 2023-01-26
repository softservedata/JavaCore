package com.edu.longs;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Integer;
import java.lang.String;


class Main {
  public static void main(String[] args) throws FileNotFoundException {
    // Uncomment the following two lines if you want to read from a file.
    // Also make sure that the lines are commented when testing with the 
    // "Test" button or when submitting. Otherwise your code may exceed the
    // time liimt.
    //
    //In.open("public/example.in");
    //Out.compareTo("public/example.out");
    //
    File data = new File("./example.in");
    Scanner sc = new Scanner(data);


    //int tests = In.readInt(); // number of tests
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
      System.out.printf("result = " + getLongestSubsequence(n, A));
    }
    
    // Uncomment this line if you want to read from a file
    //In.close();
    sc.close();
  }
  
  public static int getLongestSubsequence(int n, int[] A) {
    int h = 0;
    for (int i = 0; i < n; i++) { // O(n)
      h = Math.max(h, A[i]);
    }
  
    int[] lastSeen = new int[h + 1];
    for (int i = 0; i <= h; i++)
      lastSeen[i] = -1;
  
    int[] D = new int[n];
    int maxLength = 0;
    for (int i = 0; i < n; i++)  {
      D[i] = 1;
      for (int last = 1; last < (1 << 4); last *= 2) { // (1 << 20)
        if (A[i] - last >= 0 && lastSeen[A[i] - last] != -1) {
          D[i] = Math.max(D[i], D[lastSeen[A[i] - last]] + 1);
        }
        if (A[i] + last <= h && lastSeen[A[i] + last] != -1) {
          D[i] = Math.max(D[i], D[lastSeen[A[i] + last]] + 1);
        }
      }
      lastSeen[A[i]] = i;
      maxLength = Math.max(maxLength, D[i]);
    }
    
    return maxLength;
  }
}