package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 	다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로 
		 	연산 결과를 출력해 주시면 됩니다. (switch문 사용) 
		 	연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고 
		 	결과를 말씀해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double result = 0;
		String oper;
		boolean flag = true;
		
		System.out.print("첫 번째 정수를 입력해주세요. : ");
		num1 = sc.nextInt();
		System.out.print("연산자를 입력해주세요. (+, -, *, /) : ");
		oper = sc.next();
		System.out.print("두 번째 정수를 입력해주세요. : ");
		num2 = sc.nextInt();
		
		System.out.println("------------------------------------------");
		
		switch(oper) {
		
		case "+": case "plus":
			result = num1 + num2;
			break;
		case "-": case "minus":
			result = num1 - num2;
			break;
		case "*": case "multiplication":
			result = num1 * num2;
			break;
		case "/": case "division":
			if(num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다. 다시 입력해주세요.");
				flag = false;
				break;
			}
			result = (double)num1 / num2;
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다. 다시 입력해주세요.");
			flag = false;
		}
		
		if(flag) {
			System.out.printf("%d %s %d = %.1f\n", num1, oper, num2, result);
		}
		
		sc.close();
		
	}

}

//		Scanner sc = new Scanner(System.in);
//		
//		int num1, num2;
//		double result = 0;
//		String oper;
//		
//		System.out.print("첫 번째 정수를 입력해주세요. : ");
//		num1 = sc.nextInt();
//		System.out.print("연산자를 입력해주세요. (+, -, *, /) : ");
//		oper = sc.next();
//		System.out.print("두 번째 정수를 입력해주세요. : ");
//		num2 = sc.nextInt();
//		
//		System.out.println("------------------------------------------");
//		
//		switch(oper) {
//		
//		case "+": case "plus":
//			result = num1 + num2;
//			System.out.printf("%d와(과) %d의 덧셈 결과는 %.0f입니다.%n", num1, num2, result);
//			break;
//		case "-": case "minus":
//			result = num1 - num2;
//			System.out.printf("%d와(과) %d의 뺄셈 결과는 %.0f입니다.%n", num1, num2, result);
//			break;
//		case "*": case "multiplication":
//			result = num1 * num2;
//			System.out.printf("%d와(과) %d의 곱셈 결과는 %.0f입니다.%n", num1, num2, result);
//			break;
//		case "/": case "division":
//			if(num2 != 0) {
//				result = (double)num1 / num2;
//				System.out.printf("%d와(과) %d의 나누기 결과는 %.2f입니다.%n", num1, num2, result);
//				break;
//			} else if(num2 == 0) {
//				System.out.println("0으로는 나눌 수 없습니다. 다시 입력해주세요.");
//				break;
//			}
//		default:
//			System.out.println("연산자를 잘못 입력하셨습니다. 다시 입력해주세요.");
//		}