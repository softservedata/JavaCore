package com.softserve.edu;

public class AppMultiply {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0},
        };
        Matr matr1 = new Matr(graph);
        matr1.printMatr("Original Graph:");
        Matr matr2 = new Matr(graph);
        Matr matr3 = matr1.multiplyMatr(matr2);
        //
        matr3.printMatr("Multiply:");
    }
}
