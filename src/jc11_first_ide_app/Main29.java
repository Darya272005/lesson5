package jc11_first_ide_app;

public class Main29 {

	public static void main(String[] args) {
		int x1 = 1;
		int y1 = 1;
		int x2 = 2;
		int y2 = 2;
		int x3 = 3;
		int y3 = 3;

		if ((x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3)) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки не расположены на одной прямой");
		}
	}
}
