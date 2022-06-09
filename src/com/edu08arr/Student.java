package com.edu08arr;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Comparable<Student>, Serializable {  // extends Object

    public static class ByDescName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            if ((st1 == null) && (st2 == null)) {
                return 0;
            }
            if (st1 == null) {
                return -1;
            }
            if (st2 == null) {
                return 1;
            }
            return -st1.getName().compareTo(st2.getName());
        }
    }

    public class ByAge implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            if ((st1 == null) && (st2 == null)) {
                return 0;
            }
            if (st1 == null) {
                return -1;
            }
            if (st2 == null) {
                return 1;
            }
            return st1.getAge() - st2.getAge();
        }
    }

    public static class ByNameAndAge implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            if ((st1 == null) && (st2 == null)) {
                return 0;
            }
            if (st1 == null) {
                return -1;
            }
            if (st2 == null) {
                return 1;
            }
            int byName = st1.getName().compareTo(st2.getName());
            return byName == 0 ? st1.getAge() - st2.getAge() : byName;
            /*
            if (byName == 0) {
                return st1.getAge() - st2.getAge();
            } else {
                return byName;
            }
            */
        }
    }

    // --------------------------------------------------------------------------------

    private String name;
    private int age;

    public Student() {
        name = "";
        age = -1;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        return getName().compareTo(student.getName());
        //return getAge() - student.getAge();
    }

    @Override
    public String toString() {
        return "\nStudent [" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

}
