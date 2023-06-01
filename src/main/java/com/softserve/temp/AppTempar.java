package com.softserve.temp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AppTempar {
    public static void main(String[] args) {
        int[] arr = {13, 9, 11, 14, 16, 12, 11, 17};
        int[] days = new int[arr.length];
        //
        for (int i = 0; i < days.length; i++) {
            days[i] = 0;
        }
        //
        for (int i = 0; i < days.length; i++) {
            for (int j = i + 1; j < days.length; j++) {
                if (arr[i] < arr[j]) {
                    days[i] = j - i;
                    break;
                }
            }
        }
        //
        System.out.println(" arr: " + Arrays.toString(arr));
        System.out.println("days: " + Arrays.toString(days));
    }

}
