package For;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	
	public static int fibo(int num) {
		if(num<=1) {
			return num;
		}else {
			return fibo(num-1)+fibo(num-2);
		}
	}
}
