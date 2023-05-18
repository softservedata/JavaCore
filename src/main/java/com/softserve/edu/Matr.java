package com.softserve.edu;

import java.util.function.ObjDoubleConsumer;

public class Matr {

    private int[][] matr;

    public Matr(int[][] matr) {
        //this.matr = matr;
        initArray(matr);
    }

    // opration = or Copy Constructor
    public Matr(Matr other) {
        //this.matr = other.getMatr();
        initArray(other.getMatr());
    }

    private void initArray(int[][] other) {
        int m = other.length;
        int n = other[0].length;
        matr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = other[i][j];
            }
        }
    }

    public int[][] getMatr() {
        return matr;
    }

    public void printMatr(String message) {
        System.out.println("\n" + message);
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public Matr multiplyMatr(Matr other) {
        int k = other.getMatr().length;
        int m = matr.length;
        int n = other.getMatr()[0].length;
        int[][] result = new int[m][n];
        int temp = 0;
        //
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp = 0;
                for (int l = 0; l < k; l++) {
                    temp = temp + matr[i][l] * other.getMatr()[l][j];
                }
                result[i][j] = temp;
            }
        }
        return new Matr(result);
    }
}
