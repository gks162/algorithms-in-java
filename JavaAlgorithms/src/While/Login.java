package While;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String id = "Hello";
		String password = "1234";
		boolean login =true;
		
		do {
			System.out.print("아이디를 입력해 주세요 >> ");
			String input_id = sc.next();
			
			System.out.print("비밀번호를 입력해 주세요 >> ");
			String input_password = sc.next();
			
			if(id.equals(input_id) && password.equals(input_password)) {
				System.out.println("로그인 성공!");
				login=false;
			}else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
			}
		}
		while(login);

	}

}
