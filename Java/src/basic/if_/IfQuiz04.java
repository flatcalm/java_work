package basic.if_;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
		/*
		 - 정수 3개를 입력 받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간 값을 구해서 출력해 보세요.
		 
		 # max, mid, min이라는 변수를 미리 선언하셔서
		 	판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		 	마지막에 한번에 출력하시면 되겠습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int max, mid, min, num1, num2, num3;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 정수를 입력하세요 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) { // num1이 max일 경우
			max = num1;
			if(num2 > num3) {
				mid = num2; min = num3;
			} else {
				mid = num3; min = num2;
			}
		} else if(num2 > num1 && num2 > num3) { // num2가 max일 경우
			max = num2;
			if(num1 > num3) {
				mid = num1; min = num3;
			} else {
				mid = num3; min = num1;
			}
		} else { // num3가 max일 경우
			max = num3;
			if(num1 > num2) {
				mid = num1; min = num2;
			} else {
				mid = num2; min = num1;
			}
		}
		
		System.out.println("-------------------------");
		System.out.println("최대값 : " + max);
		System.out.println("중간값 : " + mid);
		System.out.println("최소값 : " + min);
		
		sc.close();

	}

}

// 같은 경우도 표현하려다 꼬인 삽질의 흔적
//		if(num1 > num2) {
//			if(num1 > num3) {
//				max = num1;
//				if(num2 > num3) {
//					mid = num2;
//					min = num3;
//				} else if(num2 < num3) {
//					mid = num3;
//					min = num2;
//				} else if(num2 == num3) {
//					mid = num2;
//					min = mid;
//					System.out.println("두 번째 정수와 세 번째 정수가 같습니다.");
//				}
//			} else if(num1 < num3) {
//				max = num3;
//				mid = num1;
//				min = num2;
//			}
//		} else if(num1 < num2) {
//			if(num2 > num3) {
//				max = num2;
//				if(num1 > num3) {
//					mid = num1;
//					min = num3;
//				} else if(num1 < num3) {
//					mid = num3;
//					min = num1;
//				} else if(num1 == num3) {
//					mid = num1;
//					min = mid;
//					System.out.println("첫 번째 정수와 세 번째 정수가 같습니다.");
//				}
//			} else if(num2 < num3) {
//				max = num3;
//				mid = num2;
//				min = num1;
//				}
//			else if(num1 == num2 && num1 == num3) {
//				max = num1;
//				mid = max;
//				min = mid;
//				System.out.println("세 정수가 모두 같습니다.");
//			}
//		} else if(num1 < num3) {
//			if(num1 < num2) {
//				max = num3;
//				mid = num2;
//				min = num1;
//			} else if(num1 == num2) {
//				max=num3;
//				mid=num1;
//				min=mid;
//				System.out.println("첫 번째 정수와 두 번째 정수가 같습니다.");
//			}
//			
//		}
//		
//		System.out.printf("가장 큰 수 : %d%n중간 수 : %d%n가장 작은 수 : %d%n", max, mid, min);