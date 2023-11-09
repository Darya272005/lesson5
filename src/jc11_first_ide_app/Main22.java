package jc11_first_ide_app;

public class Main22 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int temp;

		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}

		System.out.println("Перераспределение: x = " + x + ", y = " + y);
	}
}
