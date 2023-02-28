package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 키와 나이를 입력받아서 사용자가 놀이기구에 
		 탑승 할 수 있는지의 여부를 판단 하시면 됩니다.
		 키 140cm 이상, 나이가 8세 이상인 사용자만 
		 놀이기구 탑승이 가능하다고 가정하고, 판단할 수 있는 
		 로직을 작성해 보세요.
		 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다.
		 
		 놀이기구 탑승 여부와 관계 없이 "오늘 하루 즐거운 시간 되세요!"
		 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이 놀이기구는 키 140cm 이상, 8세 이상만 이용 가능합니다.");
		
		System.out.print("키를 입력하세요 : ");
		double ta = sc.nextDouble();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.printf("당신의 키는 %.1f이고, 나이는 %d세입니다.%n", ta, age);
		
		if(ta >= 140 && age >= 8) {
			System.out.println("키와 나이가 적합합니다.");
			System.out.println("놀이기구를 탑승할 수 있습니다!");
		} else {
			System.out.println("키와 나이가 부적합합니다.");
			System.out.println("놀이기구를 탑승할 수 없습니다.");
		}
		
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		
		sc.close();
		

	}

}
