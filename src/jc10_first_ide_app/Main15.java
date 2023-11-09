package jc10_first_ide_app;

public class Main15 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum += Math.pow(2, i);
		}

		System.out.println("Сумма последовательности: " + sum);
	}
}
