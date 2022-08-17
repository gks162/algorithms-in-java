package Array;

public class SandGlass {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		char c = 65;
		
		for (int i = 0; i <arr.length; i++) {
			if(i<2) {
				for (int j = i; j<arr.length-i; j++) {
					arr[i][j] = c++;
				}
			}else if(i==2){
				arr[2][2] = c++;
			}else {
				for (int j = (arr.length-1)-i; j<=i; j++) {
					arr[i][j] = c++;
				}
			}
		}
		
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
