package While;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������� : ");
		int weight = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		while(goal>= weight) {
			System.out.println("��ǥ�����Ը� �ٽ� �Է����ּ���.");
			System.out.print("��ǥ������ : ");
			goal = sc.nextInt();
		}
		int cnt = 0;
		
		while(weight > goal) {
			cnt++;
			System.out.print(cnt+"���� ���� ������ : ");
			int reduce = sc.nextInt();
			weight -= reduce;
			}
		
		System.out.println(weight+"kg �޼�!! �����մϴ�!");
	}

}
