package Array;

import java.util.Random;

public class LottoNum {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(45)+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					arr[j]=r.nextInt(45)+1;
				}
			}
			System.out.println("·£´ý¼ýÀÚ : "+arr[i]);
		}

	}

}
