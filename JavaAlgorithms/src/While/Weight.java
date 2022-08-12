package While;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		while(goal>= weight) {
			System.out.println("목표몸무게를 다시 입력해주세요.");
			System.out.print("목표몸무게 : ");
			goal = sc.nextInt();
		}
		int cnt = 0;
		
		while(weight > goal) {
			cnt++;
			System.out.print(cnt+"주차 감량 몸무게 : ");
			int reduce = sc.nextInt();
			weight -= reduce;
			}
		
		System.out.println(weight+"kg 달성!! 축하합니다!");
	}

}
