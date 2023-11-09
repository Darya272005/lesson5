package jc11_first_ide_app;

public class Main27 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 8;
		int d = 3;

		int min1 = Math.min(a, b);
		int min2 = Math.min(c, d);
		int max = Math.max(min1, min2);

		System.out.println("max{min(a, b), min(c, d)} = " + max);
	}
}
