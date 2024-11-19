package day3;

public class DecrementOperator {

	public static void main(String[] args) {

		// case 1
		int a = 10;

		a--; // a = a - 1;
		System.out.println(a); // 9

		// case 2 - post decrement
		int b = 100;

		int res = b--;

		System.out.println(res); //100
		System.out.println(b); //99
		
		
		// case 3 - pre decrement
		int c = 100;

		int result = --c;

		System.out.println(result); //99
		System.out.println(c); //99
		
	}

}
