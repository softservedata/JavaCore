package com.edu08arr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AppStud {
	public static void main(String[] args) {
		// /*-
//		Student[] students = new Student[9];
//		students[0] = new Student("Oksana", 26);
//		students[1] = new Student("Bogdan", 27);
//		students[2] = new Student("Orest", 24);
//		students[3] = new Student("Ira", 23);
//		students[4] = new Student("Yarko", 21);
//		students[5] = new Student("Bogdan", 30);
//		students[6] = new Student("Bogdan", 22);
//		students[7] = null;
//		students[8] = null;
		// */
		/*
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oksana", 26));
		students.add(new Student("Bogdan", 27));
		students.add(new Student("Orest", 24));
		students.add(new Student("Ira", 23));
		students.add(new Student("Yarko", 21));
		students.add(new Student("Bogdan", 30));
		students.add(new Student("Bogdan", 22));
		*/
		//String[] students = {"Oksana", "Bogdan", "Orest", "Ira", "Yarko"};
		//
//		System.out.println("Original Arrays: " + Arrays.toString(students));
		//System.out.println("Original Arrays: " + students);
		//
		//Arrays.sort(students);
		//Arrays.sort(students, new Student.ByDescName());
		//Arrays.sort(students, new Student().new ByAge());
//		Arrays.sort(students, new Student.ByNameAndAge());
		//Arrays.sort(students, new Student.ByNameAndAge());
		//
		//Collections.sort(students);
		//Collections.sort(students, new Student.ByNameAndAge());
		//students.sort(new Student.ByDestName());
		/*
		Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student st1, Student st2) {
						return st1.getAge() - st2.getAge();
					}
				}
		);
		*/
//		System.out.println("\nSorted Arrays: " + Arrays.toString(students));
		//System.out.println("Sorted Arrays: " + students);
		//
		/*
		Student st1 = new Student("Oksana", 26);
		//Student st2 = st1;
		Student st2 = new Student("Oksana", 26);
		System.out.println("(st1 == st2) = " + (st1 == st2));
		System.out.println("st1 = " + st1.toString()); // toString()
		System.out.println("st2 = " + st2);
		//
		System.out.println("st1.equals(st2) = " + st1.equals(st2));
		System.out.println("st1.hashCode() = " + st1.hashCode());
		System.out.println("st2.hashCode() = " + st2.hashCode());
		*/
		//
		Student[] students = new Student[7];
		students[0] = new Student("Oksana", 26);
		students[1] = new Student("Bogdan", 27);
		students[2] = new Student("Orest", 24);
		students[3] = new Student("Ira", 23);
		students[4] = new Student("Yarko", 21);
		students[5] = new Student("Bogdan", 30);
		students[6] = new Student("Bogdan", 22);
		//
		Student[] students2 = {new Student("Oksana", 26),
				new Student("Bogdan", 27),
				new Student("Orest", 24),
				new Student("Ira", 23),
		 		new Student("Yarko", 21),
				new Student("Bogdan", 30),
		 		new Student("Bogdan", 22),
		};
		//
		System.out.println("st1.eq(st2) = " + Arrays.equals(students, students2));
	}
}
