package com.edu.kras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
// ADDITIONAL IMPORTS ARE NOT ALLOWED

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //
        //File data = new File("./example2.txt");
        File data = new File("./kras1.txt");
        //File data = new File("./small1.txt");
        Scanner sc = new Scanner(data);
        //
        //
        // Uncomment the following two lines if you want to read from a file
        // In.open("public/example.in");
        // Out.open("public/example.out");

//    int n = In.readInt(); // number of vertices
//    int m = In.readInt(); // number of edges
        int n = sc.nextInt(); // number of Vertex
        int m = sc.nextInt();
        //
        int[] vertexCost = new int[n]; // cost of vertices
        int[] edge1 = new int[m]; // first nodes of the edges
        int[] edge2 = new int[m]; // second nodes of the edges
        int[] edgeCost = new int[m]; // costs of the edges

        for (int i = 0; i < n; i++) {
            vertexCost[i] = sc.nextInt(); // In.readInt();
        }
        for (int i = 0; i < m; i++) {
            edge1[i] = sc.nextInt(); // In.readInt();
            edge2[i] = sc.nextInt(); // In.readInt();
            edgeCost[i] = sc.nextInt(); // In.readInt();
        }

        sc.close();

        System.out.println("res = " + getCost(n, m, edge1, edge2, vertexCost, edgeCost));

//        Out.println(getCost(n, m, edge1, edge2, vertexCost, edgeCost));

        // Uncomment this line if you want to read from a file
        // In.close();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // Union-Find data structure for Kruskal's algorithm
    public static int[] parent;
    public static int[] rank;
    public static boolean[] isAdded;

    public static int find(int node) {
        if (parent[node] == node) {
            return node;
        }
        parent[node] = find(parent[node]);
        return parent[node];
//        return find(parent[node]);
    }

    public static void union(int node1, int node2) {
        if (rank[node1] < rank[node2]) {
            parent[node1] = node2;
        } else if (rank[node1] > rank[node2]) {
            parent[node2] = node1;
        } else {
            parent[node1] = node2;
            rank[node2] += 1;
        }
    }

    // IDEA: Add a vertex n which is connected to each vertex i with edge cost
    // equal to vertexCost[i]. Then the desired result is the cost of the minimum
    // spanning tree in this new graph.

    public static int getCost(int n, int m, int[] edge1, int[] edge2, int[] vertexCost, int[] edgeCost) {
        // Initialize data Union-Find structure
        parent = new int[n + 1];
        rank = new int[n + 1];
        isAdded = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
            isAdded[i] = false;
        }

        // Create graph with added vertex n
        int[] e1 = new int[m]; // [m + n];
        int[] e2 = new int[m]; // [m + n];
        int[] eC = new int[m]; // [m + n];
        for (int i = 0; i < m; i++) {
            e1[i] = edge1[i];
            e2[i] = edge2[i];
            eC[i] = edgeCost[i];
        }
        /*
        for (int i = 0; i < n; i++) {
            e1[m + i] = i;
            e2[m + i] = n;
            eC[m + i] = vertexCost[i];
        }
        */

        // Sort the edges
        Integer[] index = new Integer[m]; // [m + n];
        for (int i = 0; i < m; i++) { // for (int i = 0; i < m + n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, new Comparator<Integer>() {
            public int compare(Integer lhs, Integer rhs) {
                return Integer.signum(eC[lhs] + vertexCost[e2[lhs]]  - (eC[rhs] + vertexCost[e2[rhs]]) );
                //return Integer.signum(eC[lhs] - eC[rhs]);
            }
        });

        // Kruskal's algorithm
        int result = 0;
        for (int i = 0; i < m; i++) {  // for (int i = 0; i < m + n; i++)
            if (find(e1[index[i]]) != find(e2[index[i]])) {
                union(find(e1[index[i]]), find(e2[index[i]]));
                if ( !isAdded[ e1[ index[i] ] ] ) {
                    result += vertexCost[ e1[ index[i] ] ];
                    isAdded[ e1[ index[i] ] ] = true;
                }
                if ( !isAdded[ e2[ index[i] ] ] ) {
                    result += vertexCost[ e2[ index[i] ] ];
                    isAdded[ e2[ index[i] ] ] = true;
                }
                result += eC[index[i]];
            }
        }

        return result;
    }
}