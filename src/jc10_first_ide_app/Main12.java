package jc10_first_ide_app;

public class Main12 {

	public static void main(String[] args) {
		int a;
		int product;

		a = 1;
		product = a;

		for (int i = 2; i <= 10; i++) {
			a = 6 + a;
			product = product * a;
		}
		System.out.println("Произведение первых 10 членов последовательности:" + product);
	}

}
