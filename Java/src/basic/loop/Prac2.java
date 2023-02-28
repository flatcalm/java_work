package basic.loop;

public class Prac2 {
	
	public static void main(String[] args) {
		
		/*
        1. 구구단을 다음과 같이 가로로 출력해 보세요.

        2단: 2x1=2 2x2=4 2x3=6 .....
        3단: 3x1=3 3x2=6 3x3=9 .....
        4단: 4x1=4 4x2=8 4x3=12 .....

        2. 구구단을 다음과 같이 세로로 출력해 보세요.
        각 단의 간격은 탭 하나로 고정하겠습니다.
        2단         3단
        2x1=2      3x1=3
        2x2=4      3x2=6
        2x3=6      3x3=9
        .
        .
        .
        */
		
		System.out.println("가로로 나오는 구구단");
		
		for(int i=2; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0) {
					System.out.print(i + "단 : ");
				} else {
					System.out.printf("%d×%d=%d ", i, j, i*j);
					if(j==9) {
						System.out.println();
					}
				} 
			}
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		for(int i=0; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(i==0) {
					System.out.print(j + "단\t");
					if(j==9) {
						System.out.println();
					}
				} else {
					if(j==9) {
						System.out.printf("%d×%d=%d\t", j, i, j*i);
						System.out.println();
					} else {
						System.out.printf("%d×%d=%d\t", j, i, j*i);
					}
				}
			}
		}
	}
	
}
