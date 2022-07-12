package com.edu15csv;

import java.util.ArrayList;
import java.util.List;

public class ApplCsv {
    public static void main(String[] args) {
        System.out.println("Start");
        CSVReader reader = new CSVReader("users.csv");
        /*
        for (List<String> row : reader.getAllCells()) {
            System.out.println("\tRow:");
            for (String s : row) {
                System.out.print(s +"  ");
            }
            System.out.println();
        }
        */
        //
        List<User> users = new ArrayList<>();
        for (List<String> row : reader.getAllCells()) {
            if (row.get(4).contains("@")) {
                users.add(new User(row.get(0), row.get(1), row.get(02), row.get(03), row.get(4), row.get(5)));
            }
        }
        System.out.println(users);
    }
}
