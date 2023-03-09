package etc.exception.basic;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x,y;
			
			try {
				System.out.println("첫번째 정수를 입력하세요.");
				System.out.print("> ");
				x = sc.nextInt();
				System.out.println("두번째 정수를 입력하세요.");
				System.out.print("> ");
				y = sc.nextInt();
				
				System.out.printf("입력 받은 정수 : %d, %d\n정수의 합 : %d\n", x, y, x+y);
				
				break;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("프로그램 정상 종료!");
		
		sc.close();

	}

}
