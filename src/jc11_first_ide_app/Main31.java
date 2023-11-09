package jc11_first_ide_app;

public class Main31 {

	public static void main(String[] args) {
		int num1 = -1;
		int num2 = 3;
		int num3 = 5;

		if ((num1 + num2) > 0 || (num1 + num3) > 0 || (num2 + num3) > 0) {
			System.out.println("Сумма каких-либо двух чисел положительна");
		} else {
			System.out.println("Сумма двух чисел не положительна");
		}
	}
}
