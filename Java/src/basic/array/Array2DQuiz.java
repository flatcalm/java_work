package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {
		
		int[][] score = {
				{79, 80, 99}, // A학생
				{95, 85, 89}, // B학생
				{90, 65, 56}, // C학생
				{69, 78, 77}  // D학생
				// 과목 : 3과목
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};
		
		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 
		 2. 각 과목의 평균을 출력해 보세요.
		 
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */
		
		// 1번
		double totalAvg = 0.0; // 학생들의 평균점수의 총합. (3번 문제에 필요한 변수.)
		int idx = 0; // stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
		for(int[] stu : score) {
			int total = 0; // stu 배열이 바뀔때마다(학생이 바뀐 것) 총점이 0이 되어야 하기 때문에 total은 첫번째 for문 안에 존재해야함
			for(int s : stu) {
				total += s;
			}
			double avg = (double) total / subName.length;
			totalAvg += avg;
			System.out.printf("%s의 평균 : %.1f점\n", stuName[idx], avg);
			idx++;
		}
		
		System.out.println("--------------------------------------------------");
		
		// 2번
		for(int i=0; i<subName.length; i++) {
			int total = 0;
			for(int j=0; j<stuName.length; j++) {
				total += score[j][i];
			}
			double avg = (double)total / stuName.length;
			System.out.printf("%s의 평균 점수 : %.1f점\n", subName[i], avg);
		}
		
		System.out.println("--------------------------------------------------");
		
		// 3번
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리 반 평균 : %.1f점\n", classAvg);
		
		
		
//		내가 한거
//		
//		int[] stuTotal = new int[stuName.length];
//		int[] subTotal = new int[subName.length];
//		double[] stuAvg = new double[stuName.length];
//		double[] subAvg = new double[subName.length];
//		double classSum = 0, classAvg = 0;
//		
//		for(int i=0; i<stuName.length; i++) {
//			for(int j=0; j<subName.length; j++) {
//				stuTotal[i] += score[i][j];
//				subTotal[j] += score[i][j];
//				subAvg[j] = (double) subTotal[j] / stuName.length;
//			}
//			stuAvg[i] = (double) stuTotal[i] / subName.length;
//			classSum += stuAvg[i];
//		}
//		
//		classAvg = classSum / stuName.length;
//		
//		for(int i=0; i<stuName.length; i++) {			
//			System.out.printf("%s의 평균 : %.1f%n",stuName[i], stuAvg[i]);
//		}
//		
//		System.out.println("------------------------------");
//		
//		for(int i=0; i<subName.length; i++) {
//			System.out.printf("%s의 평균 : %.1f%n",subName[i], subAvg[i]);
//		}
//		
//		System.out.println("------------------------------");
//		
//		System.out.printf("반 평균 : %.1f%n", classAvg);
//		
//		
		
	}

}
