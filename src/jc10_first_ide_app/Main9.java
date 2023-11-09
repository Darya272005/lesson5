package jc10_first_ide_app;

public class Main9 {

	public static void main(String[] args) {
		int sum;
		
		sum=0;
		
		for(int i=1;i<=100;i++) {
			sum+=i*i;
		}
		System.out.println("Сумма квадратов первых ста чисел:"+ sum);
	}

}
