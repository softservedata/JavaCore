package com.softserve.edu;

public class Matrix {

    private final int DEFAULT_N = 4;
    private double[][] matr;
    private double[] vect;

    public Matrix() {
        initMatrix();
        initVector();
    }

    public Matrix(double[][] matr) {
        initMatrix(matr);
    }

    private void initMatrix() {
        matr = new double[][] {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 4, 3, 2, 1 },
            { 8, 7, 6, 5 }
        };
    }

    private void initVector() {
        vect = new double[] { 10, 2, 3, 4 };
    }
    private void initMatrix(double[][] matr) {
        int m = matr.length;
        int n = matr[0].length;
        this.matr = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                this.matr[i][j] = matr[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
