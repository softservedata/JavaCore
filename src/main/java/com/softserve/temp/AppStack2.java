package com.softserve.temp;

import java.util.Arrays;

public class AppStack2 {

    public static void main(String[] args) {
        int[] arr = {13, 9, 11, 14, 16, 12, 11, 17};
        int[] days = new int[arr.length];
        //
        for (int i = 0; i < days.length; i++) {
            days[i] = 0;
        }
        //
        Stack2 stack = new Stack2();
        Element2 element = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            element = null;
            while (!stack.isEmpty()) {
                element = stack.pop();
                if (arr[i] < element.getData()) {
                    days[i] = element.getIndex() - i;
                    stack.push(element);
                    stack.push(new Element2(arr[i], i));
                    break;
                }
            }
            if ((element == null) || (arr[i] >= element.getData())) {
                stack.push(new Element2(arr[i], i));
            }
        }
        //
        System.out.println(" arr: " + Arrays.toString(arr));
        System.out.println("days: " + Arrays.toString(days));
    }
}
