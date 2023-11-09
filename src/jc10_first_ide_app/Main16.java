package jc10_first_ide_app;

public class Main16 {

	public static void main(String[] args) {

		int product = 1;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			product *= sum;
		}

		System.out.println("Произведение последовательности: " + product);

	}

}
