package com.softserve.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AppSort {

    public Stud[] getStud() {
        return new Stud[]{
                new Stud(16, "Ivan", 4.4),
                new Stud(14, "Ira", 4.1),
                new Stud(22, "Petro", 4.3),
                new Stud(11, "Andriy", 4.8),
                new Stud(18, "Stepan", 4.7),
                new Stud(24, "Natalya", 4.0),
                new Stud(19, "Orest", 3.9),
                new Stud(15, "Olena", 5.0),
                new Stud(21, "Ihor", 4.6),
        };
    }

    public void printStud(Stud[] studs) {
        for (int i = 0; i < studs.length; i++) {
            System.out.println(studs[i]);
        }
    }


    public static void main(String[] args) {
        Sort sort = new Sort();
        AppSort appSort = new AppSort();
        //
        Stud[] studs = appSort.getStud();
        System.out.println("Original:");
        appSort.printStud(studs);
        //
        //Arrays.sort(studs, (a, b) -> a.getId() - b.getId());
        //Arrays.sort(studs, (a, b) -> a.getMark() - b.getMark() > 0 ? 1 : a.getMark() - b.getMark() < 0 ? -1 : 0);
        //Arrays.sort(studs, (a, b) -> a.getName().compareTo(b.getName()));
        //
        //sort.bubble(studs);
        //sort.bubble(studs, (a, b) -> a.getId() - b.getId());
        //sort.bubble(studs, (a, b) -> a.getMark() - b.getMark() > 0 ? 1 : a.getMark() - b.getMark() < 0 ? -1 : 0);
        sort.bubble(studs, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("\nSorted:");
        appSort.printStud(studs);
    }
}
