package While;

import java.util.Random;
import java.util.Scanner;

public class PlusGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("==Plus Game==");
		
		int num1 = r.nextInt(20)+1;
		int num2 = r.nextInt(20)+1;
		String s = "";
		while(true) {
			System.out.print(num1+"+"+num2+"=");
			int sum = sc.nextInt();	
			if((num1+num2) == sum) {
				System.out.println("Success");
				System.out.print("계속 하시겠습니까 >> ");
				s = sc.next();
				if(s.equals("Y")) {
					num1 = r.nextInt(20)+1;
					num2 = r.nextInt(20)+1;
				}else if(s.equals("N")) {
					break;
				}
			}else {
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까 >> ");
				s = sc.next();
				if(s.equals("N")){
					break;
				}
			}
		}
		sc.close();
		System.out.println("게임을 종료합니다.");
		
	}
}
