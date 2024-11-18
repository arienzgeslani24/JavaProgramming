package day2;

public class DataTypesDemo {

	public static void main(String[] args) {

		// Numeric data types
		int a = 100, b = 200;
		System.out.println("the value of a is: " + a);
		System.out.println("the value of b is: " + b);
		System.out.println(a + b);
		System.out.println("the sum of a and b is: " + a + b);
		System.out.println("the sum of a and b is: " + (a + b));

		byte by = 125;
		System.out.println(by);

		short sh = 3535;
		System.out.println(sh);

		long l = 312312312312312L; // literal is needed L/l
		System.out.println(l);

		// Decimal Numbers - float, double
		float item_price = 15.5F; // literal is needed F/f
		System.out.println(item_price);

		double dbl = 1234.31241232;
		System.out.println(dbl);

		// letters
		char grade = 'A';
		System.out.println(grade);

		String name = "John";
		System.out.println(name);

		// char ch='ABC'; // invalid
		// String ch='ABC'; //invalid
		// String ch='A'; //invalid
		String ch = "A";
		System.out.println(ch);

		// true or false

		boolean bl = false; // allows only true or false
		System.out.println(bl);

		// boolean bl = "true"; // invalid
		// boolean bl = "false"; // invalid
		// String bl=true; //invalid
		String lb = "true";
		System.out.println(lb);
	}

}
