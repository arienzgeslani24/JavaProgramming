package day3;

public class IncrementOperator {

	public static void main(String[] args) {

		// ++ is called increment operator

		// case 1
		int a = 10;
		System.out.println(a);

		a++; // a = a + 1;
		System.out.println(a);

		// case 2 - post increment
		int b = 10;
		int res = b++; // post increment - assignment happened then incrementation
		System.out.println(res); // 10
		System.out.println(a); // 11

		// case 3 - pre increment
		int c = 10;
		int result = ++c; // pre increment - incrementation then assignment happened
		System.out.println(result); // 11
		System.out.println(c); // 11

	}

}
