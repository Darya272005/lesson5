package jc11_first_ide_app;

public class Main28 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 8;
		int d = 3;

		if (a == d) {
			System.out.println("a равно d");
		} else if (b == d) {
			System.out.println("b равно d");
		} else if (c == d) {
			System.out.println("c равно d");
		} else {
			int maxDiff = Math.max(Math.max(d - a, d - b), d - c);
			System.out.println("max(d - a, d - b, d - c) = " + maxDiff);
		}
	}
}
