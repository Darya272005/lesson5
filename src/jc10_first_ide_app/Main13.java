package jc10_first_ide_app;

public class Main13 {

	public static void main(String[] args) {
		double x;

		x = -5;

		while (x <= 5) {
			double y = 5 - (x * x) / 2;
			System.out.println("x = " + x + " y = " + y);
			x += 0.5;
		}
	}

}
