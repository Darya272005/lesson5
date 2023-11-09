package jc10_first_ide_app;

public class Main5 {

	public static void main(String[] args) {
		int number;
		int sum;

		number = 1;
		sum = 0;

		while (number <= 99) {
			sum += number;
			number += 2;
		}
		
		System.out.println("Сумма нечетных чисел:"+ sum);

	}

}
