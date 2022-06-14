package com.edu08arr;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getAge());
//    }

    @Override
    public int hashCode() {
        final int prime = 31; // =2^5-1
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("\tpublic boolean equals(Object obj) DONE");
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
//        if (hashCode() != obj.hashCode()) {
//            return false;
//        }
        Student other = null;
        if (obj instanceof Student) {
            other = (Student) obj;
        }
        if ((other == null) || (age != other.age)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null))) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
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
