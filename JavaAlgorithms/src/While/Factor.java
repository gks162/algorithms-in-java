package While;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.print(num+" = ");
		int num2 = 2;

		while (true) {
			if(num%num2==0) {
				num/=num2;
				if(num==1) {
					System.out.println(num2);
					break;
				}else {
					System.out.print(num2+"*");
				}
			}else {
				num2++;
			}
		}
	}
}
