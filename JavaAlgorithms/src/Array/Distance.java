package Array;

public class Distance {

	public static void main(String[] args) {
		int[] point = {92,32,52,9,81,2,68};
		int a=0;
		int b=0;
		int distance = point[0]-point[1];
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if(distance>Math.abs(point[i]-point[j]) && i!=j) {
					distance = point[i]-point[j];
					a=i;
					b=j;
				}
			}
		}
		System.out.println("result = ["+a+","+b+"]");
	}
}
