package For;

import java.util.Scanner;

public class star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		for(int line = 0; line<arr.length; line++) {
			System.out.print(arr[line]+" : ");
			for (int star = 0; star < arr[line]; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
