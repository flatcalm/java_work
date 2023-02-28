package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 # 국어, 영어, 수학 점수를 각각 입력 받아서 
		 	평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 	평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 	95 ~ 100 -> A+
		 	94 ~ 90 -> A0
		 	80점대는 B, 70점대는 C, 60점대는 D, 나머지는 
		 	모두 F 처리하시면 됩니다. (100점이 만점)
		 	
		 	ex)
		 		평균 점수 : 95.5
		 		당신의 학점은 A+ 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor, math, eng;
		String grade;
		
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		double avg = (double)(kor + math + eng) / 3;
		
		if(avg >= 90) {
			if(avg > 100) {
				grade = "0";
			}
			else if(avg >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if(avg >= 80) {
			grade = "B";
		} else if(avg >= 70) {
			grade = "C";
		} else if(avg >= 60) {
			grade = "D";
		} else {
			if(avg < 0) {
				grade = "0";
			}
			else {
				grade = "F";				
			}
		}
		
		if(grade != "0") {
			System.out.printf("당신의 학점은 %s 입니다.%n", grade);			
			System.out.println("--------------------------");
			System.out.printf("입력 받은 국어 점수 : %d%n입력 받은 수학 점수 : %d%n입력 받은 영어 점수 : %d%n", kor, math, eng);
			System.out.printf("평균 점수 : %.1f%n", avg);
			System.out.println("--------------------------");
		} else {
			System.out.println("--------------------------");
			System.out.println("잘못된 점수입니다. 점수를 다시 입력하세요.");
		}
		
		sc.close();

	}

}
