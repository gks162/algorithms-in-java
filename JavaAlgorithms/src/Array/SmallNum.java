package Array;

import java.util.Scanner;

public class SmallNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		for(int i=1; i<=arr.length; i++) {
			System.out.print(i+"번째 정수 입력 >> ");
			arr[i-1] = sc.nextInt();
		}
		System.out.print("결과 >> ");
		for (int i = 1; i <= arr.length; i++) {
			if(arr[i-1]<x) {
				System.out.print(arr[i-1]+ " ");
			}
		}
	}
}
