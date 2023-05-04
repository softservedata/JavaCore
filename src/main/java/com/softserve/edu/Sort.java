package com.softserve.edu;

import java.util.Comparator;

class Stud {
    private int id;
    private String name;
    private double mark;

    public Stud(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

public class Sort {

    public void bubble(Stud[] studs, Comparator<Stud> comparator) {
        boolean isContinue = true;
        Stud temp = null;
        for (int i = 0; isContinue && i < studs.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < studs.length - 1 - i; j++) {
                //if (studs[j].getId() > studs[j + 1].getId()) {
                //if (studs[j].getMark() > studs[j + 1].getMark()) {
                //if (studs[j].getName().compareTo(studs[j + 1].getName()) > 0) {
                if (comparator.compare(studs[j], studs[j + 1]) > 0) {
                    temp = studs[j];
                    studs[j] = studs[j + 1];
                    studs[j + 1] = temp;
                    isContinue = true;
                }
            }
        }
    }

    public void bubble(Stud[] studs, Comparator<Stud> comparator, int[] index) {
        boolean isContinue = true;
        int temp = -1;
        for (int i = 0; isContinue && i < studs.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < studs.length - 1 - i; j++) {
                if (comparator.compare(studs[index[j]], studs[index[j + 1]]) > 0) {
                    temp = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = temp;
                    isContinue = true;
                }
            }
        }
    }

}
