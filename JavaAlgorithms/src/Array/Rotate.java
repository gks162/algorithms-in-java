package Array;

public class Rotate {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		
		System.out.println("����");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j < arr.length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("90�� ȸ��");
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j < arr.length; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
