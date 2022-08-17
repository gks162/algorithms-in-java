package Array;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2진수 입력");
		String binary = sc.next();
		
		String[] arrBinary = binary.split("");
		int[] arr = new int[binary.length()];
	
		for (int i = 0; i < arrBinary.length; i++) {
			arr[i] = Integer.parseInt(arrBinary[i]);
		}
		
		int result = 0;
		int cnt = 1;
		
		for (int i = arr.length-1; i >= 0 ; i--) {
			result += arr[i] * cnt;
			cnt *= 2;
		}
		System.out.println(binary+"(2) = "+ result+"(10)");
	}

}
