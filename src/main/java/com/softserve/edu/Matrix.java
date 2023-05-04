package com.softserve.edu;

public class Matrix {

    private final int DEFAULT_N = 4;
    private double[][] matr;
    private double[] vect;

    public Matrix() {
        initMatrix();
        initVector();
    }

    public Matrix(double[][] matr, double[] vect) {
        initMatrix(matr);
        initVector(vect);
    }

    /*
    private void initMatrix() {
        matr = new double[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {4, 3, 5, 3},
                {8, 7, 6, 9}
        };
    }
    */

    private void initMatrix() {
        matr = new double[][]{
                {1, 2, 4, 7},
                {5, 6, 7, 8},
                {4, 3, 2, 6},
                {8, 7, 6, 5}
        };
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

    // Overload
    private void initVector() {
        //vect = new double[]{10, 26, 15, 30};
        //vect = new double[]{5, 13, 7.5, 15};
        vect = new double[]{14, 26, 15, 26};
    }

    // Overload
    private void initVector(double[] vect) {
        int m = vect.length;
        for (int i = 0; i < m; i++) {
            this.vect[i] = vect[i];
        }
    }

    public void printMatrix() {
        System.out.println("\nprintMatrix:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void printVector() {
        System.out.println("\nprintVector:");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + "  ");
        }
        System.out.println();
    }

    public void printSlr() {
        System.out.println("\nprintSlr:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf("%7.2f", matr[i][j]);
            }
            System.out.printf("  |  %7.2f\n", vect[i]);
        }
    }

    public int[] getIndex(int n) {
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        return index;
    }

    public void updateIndex(int[] index, int k) {
        double maxElement = matr[index[k]][k];
        int maxPosition = k;
        int t = -1;
        for (int i = k + 1; i < matr.length; i++) {
            if (maxElement < matr[index[i]][k]) {
                maxElement = matr[index[i]][k];
                maxPosition = i;
            }
        }
        if (k != maxPosition) {
            t = index[maxPosition];
            index[maxPosition] = index[k];
            index[k] = t;
        }
    }

    public void methodGaussa() {
        int m = matr.length; // mxm
        double temp = 0;
        for (int k = 0; k < m - 1; k++) {
            for (int i = k + 1; i < m; i++) {
                temp = matr[i][k] / matr[k][k];
                for (int j = k + 1; j < m; j++) { // for (int j = k + 1; j < m; j++) {
                    matr[i][j] = matr[i][j] - matr[k][j] * temp;
                }
                vect[i] = vect[i] - vect[k] * temp;
            }
        }
        // /*
        for (int i = m - 1; i >= 0; i--) {
            temp = 0;
            for (int j = i + 1; j < m; j++) {
                temp = temp + vect[j] * matr[i][j] / matr[j][j];
            }
            vect[i] = vect[i] - temp;
        }
        for (int i = m - 1; i >= 0; i--) {
            vect[i] = vect[i] / matr[i][i];
        }
        // */
    }

    public void methodGaussaIndex() {
        int m = matr.length; // mxm
        double temp = 0;
        int[] index = getIndex(m);
        for (int k = 0; k < m - 1; k++) {
            //
            updateIndex(index, k);
            for (int i = k + 1; i < m; i++) {
                temp = matr[index[i]][k] / matr[index[k]][k];
                for (int j = k; j < m; j++) { // for (int j = k + 1; j < m; j++) {
                    matr[index[i]][j] = matr[index[i]][j] - matr[index[k]][j] * temp;
                }
                vect[index[i]] = vect[index[i]] - vect[index[k]] * temp;
            }
        }
        // /*
        for (int i = m - 1; i >= 0; i--) {
            temp = 0;
            for (int j = i + 1; j < m; j++) {
                temp = temp + vect[index[j]] * matr[index[i]][j] / matr[index[j]][j];
            }
            vect[index[i]] = vect[index[i]] - temp;
        }
        for (int i = m - 1; i >= 0; i--) {
            vect[index[i]] = vect[index[i]] / matr[index[i]][i];
        }
        // */
    }

}
