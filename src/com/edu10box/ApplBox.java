package com.edu10box;

public class ApplBox {

	public static <T> T write(T t) {
		//Integer a = new Integer(1);
		System.out.println("t = " + t); // .toString();
		return t;
	}

	public static void main(String[] args) {
		/*-
		Box box = new Box();
		box.set(123); // int, -> Integer new Integer(123)
		// Code
		//
		box.set("123");
		//
		int i = (int) box.get(); // Code Smell. Runtime Error
		System.out.println("i = " + i);
		*/
		/*-
		BoxWrapper box = new BoxWrapper();
		//box.set(123); // Compile Error.
		box.set("123");
		//
		//int i = (int) box.get(); // Compile Error.
		//int i = Integer.valueOf(box.get()); // try {} catch
		String i = box.get();
		System.out.println("i = " + (i + 11));
		*/
		// /*-
		BoxGen<String> box = new BoxGen<>();
		//box.set(123); // Compile Error.
		box.set("123");
		//
		// int i = (int) box.get(); // Compile Error.
		// int i = Integer.valueOf(box.get()); // try {} catch
		String i = box.get();
		System.out.println("i = " + (i + 11));
		//
		BoxGen<Integer> box2 = new BoxGen<>(); // = new BoxGen<Integer>();
		//box2.set("321"); // Compile Error.
		box2.set(321);
		//
		int i2 = box2.get();
		// String i3 = (String) box2.get(); // Compile Error.
		System.out.println("i2 = " + (i2 + 11));
		//
		write(box.get());
		write(box2.get());
		// */
		// /*-
		BoxGen<A> box3 = new BoxGen<>();
		box3.set(new A());
		write(box3.get());
		int i3 = write(345);
		System.out.println("i++ = " + ++i3);
		// */
	}
}
