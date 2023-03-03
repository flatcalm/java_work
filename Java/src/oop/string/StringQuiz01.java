package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 1. 스캐너를 통해 id를 입력받습니다.
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력 후 종료하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID를 5글자 이상으로 입력하세요.");
			System.out.print("> ");
			String id = sc.nextLine().trim();
//			System.out.println(id);
			id = id.replace(" ", "");
//			System.out.println(id);
			if(id.length() < 5) {
				System.out.println("입력받은 ID가 5글자 미만입니다.");
				System.out.println("다시 입력해주세요.");
			} else {
				System.out.println("ID가 등록되었습니다.");
				System.out.println("등록된 ID : " + id);
				break;
			}
		}
		sc.close();
	}

}
