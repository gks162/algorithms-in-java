package While;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String id = "Hello";
		String password = "1234";
		boolean login =true;
		
		do {
			System.out.print("���̵� �Է��� �ּ��� >> ");
			String input_id = sc.next();
			
			System.out.print("��й�ȣ�� �Է��� �ּ��� >> ");
			String input_password = sc.next();
			
			if(id.equals(input_id) && password.equals(input_password)) {
				System.out.println("�α��� ����!");
				login=false;
			}else {
				System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
			}
		}
		while(login);

	}

}
