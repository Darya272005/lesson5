package jc11_first_ide_app;

public class Main30 {

	public static void main(String[] args) {
		double a = 5.5;
		double b = 3.3;
		double c = 2.2;

		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
}
