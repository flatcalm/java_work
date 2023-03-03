package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함해서 받을 에정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지 구분해서 출력해 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-을 포함해서 주민등록번호 13자리를 입력해주세요.");
			System.out.print("> ");
			String num = sc.next();
			if((num.replace("-", "")).length() != 13) {
				System.out.println("주민번호를 잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요.");
			} else {
				
//				String n = num.substring(7, 8);
//				if(n.equals("1") || n.equals("3")) {
//					System.out.println("남자입니다.");
//					break;
//				} else if(n.equals("2") || n.equals("4")) {
//					System.out.println("여자입니다.");
//					break;
//				}
				
				char n = num.charAt(7);
				if(n=='1' || n=='3') {
					System.out.println("남자입니다.");
					break;
				} else if(n=='2' || n=='4') {
					System.out.println("여자입니다.");
					break;
				}
				
				else {
					System.out.println("잘못된 주민번호입니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
			
			
		}
		
//		강사님이 하신거
//		outer: while(true) {
//			System.out.println("주민등록번호 13자리를 입력하세요.");
//			System.out.println("-을 포함해서 입력하세요.");
//			System.out.print("> ");
//			String ssn = sc.next();
//			
//			ssn = ssn.replace("-", "");
//			
//			if(ssn.length() != 13) {
//				System.out.println("주민등록번호는 13자리 입니다.");
//			} else {
//				switch(ssn.charAt(6)) {
//				case '1': case '3':
//					System.out.println("남자입니다.");
//					break outer;
//				
//				case '2': case '4':
//					System.out.println("여자입니다.");
//					break outer;
//					
//				default:
//					System.out.println("잘못 입력했습니다.");
//				}
//			}
//			
//		}	
		
		sc.close();
	}

}
