package Array;

import java.util.Scanner;

public class SortAsc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
