package Array;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num1 = sc.nextInt();
		System.out.println("대시(-)의 총 합 >> "+digit(num1));
	}
	
	public static int digit(int num) {
		int result = 0;
		int[] digitNum = {6,2,5,5,4,5,6,3,7,6};
		while(num>0) {
			int num2 = num%10;
			num /= 10;
			result += digitNum[num2];
		}
		return result;
	}
}
