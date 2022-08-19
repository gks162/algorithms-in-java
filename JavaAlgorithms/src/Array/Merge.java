package Array;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[] = {2,4,6,8,10,12,14,16,18,20};
		int merge[] = mergeArray(A,B);
	}

	public static int[] mergeArray(int[] a, int[] b) {
		int[] arr = new int[a.length+b.length];
		
		for(int i = 0; i < a.length; i++) {
			arr[i] = a[i];
			arr[i+a.length] = b[i];
		}
		
		Arrays.sort(arr);
		
		System.out.print("Merge : [");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.println("]");
		return arr;
	}
}
