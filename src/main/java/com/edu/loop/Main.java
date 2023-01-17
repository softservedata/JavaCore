package com.edu.loop;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Uncomment the following two lines if you want to read from a file.
        // In.open("public/0-example.in");
        // Out.compareTo("public/0-example.out");

        //File data = new File("./0-example.in");
        File data = new File("./1-cycle_length.in");
        Scanner sc = new Scanner(data);

        //int tests = In.readInt(); // number of tests
        int tests = sc.nextInt();

        for (int t = 0; t < tests; t++) {
//      int n = In.readInt(); // number of nodes
//      int q = In.readInt(); // number of queries
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] edgeFrom = new int[n]; // array of edges
            for (int i = 0; i < n; i++) {
                //edgeFrom[i] = In.readInt(); // there is an edge from i to edgeFrom[i]
                edgeFrom[i] = sc.nextInt();
            }

            Graph G = new Graph(n, edgeFrom); // graph
            G.initialize();

            // queries
            for (int i = 0; i < q; i++) {
                //int type = In.readInt();
                int type = sc.nextInt();
                if (type == 1) {
                    // cycleLength
                    //Out.println(G.cycleLength());
                    System.out.println(G.cycleLength());
                    //
                } else if (type == 2) {
                    // distanceToCycle
                    // int x = In.readInt();
                    int x = sc.nextInt();
                    //Out.println(G.distanceToCycle(x));
                    System.out.println(G.distanceToCycle(x));
                    //
                } else if (type == 3) {
                    // firstNodeInCycle
                    //int x = In.readInt();
                    int x = sc.nextInt();
                    //Out.println(G.firstNodeInCycle(x));
                    System.out.println(G.firstNodeInCycle(x));
                    //
                } else if (type == 4) {
                    // distanceInCycle
                    //int x = In.readInt();
                    //int y = In.readInt();
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    //Out.println(G.distanceInCycle(x, y));
                    System.out.println(G.distanceInCycle(x, y));
                    //
                }
            }
        }

        // Uncomment this line if you want to read from a file
        //In.close();
        sc.close();
    }
}

class Graph {
    private int n;             // number of nodes
    private int[] edgeFrom;    // edgeFrom[i]: there is an edge from i to edgeFrom[i]
    private int[] inDegree;    // inDegree[i]: the in-degree of i
    private int[][] edgesTo;   // edgesTo[i][j]: there is an edge to i from edgesTo[i][j]
    // note: edgesTo[i] is an array of length inDegree[i]
    //
    private int[] parent;
    private int[] sequence;
    private int[] cycl;
    private int cyclLen;

    Graph(int n, int[] edgeFrom) {
        this.n = n;
        this.edgeFrom = edgeFrom;

        // The following code computes inDegree and edgesTo.
        inDegree = new int[n];
        edgesTo = new int[n][];
        for (int i = 0; i < n; i++) {
            inDegree[edgeFrom[i]]++;
        }
        for (int i = 0; i < n; i++) {
            edgesTo[i] = new int[inDegree[i]];
            inDegree[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            edgesTo[edgeFrom[i]][inDegree[edgeFrom[i]]++] = i;
        }
    }

    public void initialize() {
        // TODO: implement.

        // Note that you have access to the information in the class variables n,
        // edgeFrom, inDegree, and edgesTo, whose definitions are explained at the
        // top of the Graph class.
        // You are allowed to also define other class variables and functions.
        //
        parent = new int[n];
        sequence = new int[n];
        cycl = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
            sequence[i] = -1;
            cycl[i] = -1;
        }
        cyclLen = -1;
    }

    public int cycleLength() {
        // TODO: implement.
        //
        int result = 0;
        int k;
        for (k = 0; k < n; k++) {
            if (inDegree[k] > 1) {
                break;
            }
        }
        parent[k] = k;
        sequence[k] = edgeFrom[k];
        //
        int j = edgeFrom[k];
        while (parent[j] != k) {
            parent[j] = k;
            sequence[j] = edgeFrom[j];
            j = edgeFrom[j];
        }
        //
        int i = j;
        do {
            cycl[i] = sequence[i];
            i = sequence[i];
            result++;
        } while (i != j);
        cycl[i] = sequence[i];
        //
        cyclLen = result;
        return result;
    }

    public int distanceToCycle(int x) {
        // TODO: implement.
        //
        int result = 0;
        while (cycl[x] == -1) {
            result++;
            x = edgeFrom[x];
        }
        return result;
    }

    public int firstNodeInCycle(int x) {
        // TODO: implement.
        //
        while (cycl[x] == -1) {
            x = edgeFrom[x];
        }
        return x;
    }

    public int distanceInCycle(int x, int y) {
        // TODO: implement.
        int x0 = distanceToCycle(x);
        int y0 = distanceToCycle(y);
        int min = Math.min(x0, y0);
        x0 = x0 - min;
        y0 = y0 - min;
        x0 = x0 % cyclLen;
        y0 = y0 % cyclLen;
        //
        int x1 = firstNodeInCycle(x);
        int y1 = firstNodeInCycle(y);
        //
        while (x0 > 0) {
            y1 = cycl[y1];
            x0--;
        }
        //
        while (y0 > 0) {
            x1 = cycl[x1];
            y0--;
        }
        //
        int result = 0;
        while (x1 != y1) {
            x1 = cycl[x1];
            result++;
        }
        result = Math.min(result, cyclLen-result);
        //
        return result;
    }
}