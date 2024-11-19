package day3;

public class TernaryOperator {

	public static void main(String[] args) {

		// Var = exp ? result 1:result 2;

		// Example1
		int a = 200, b = 100;

		int x = (a > b) ? a : b; // if expression is TRUE return a, if FALSE return b
		System.out.println(x);

		// Example2

		int y = (1 == 1) ? 100 : 200;
		System.out.println(y); // 100

		int z = (1 == 2) ? 200 : 100;
		System.out.println(y); // 100

		// Example3
		int person_age = 15;
		String res = (person_age >= 18) ? "Eligible" : "Not eligible";
		System.out.println(res);

	}

}
