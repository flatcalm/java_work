package basic.loop;

public class LoopNestingQuiz01 {
	
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
		
		
		for(int x=2; x<=9; x++) {
			System.out.print(x + "단 : ");
			for(int y=1; y<=9; y++) {
				System.out.printf("%d × %d = %d ", x, y, x*y);
				if(y == 9) {
					System.out.println();
				}
			}
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		for(int hang=0; hang<=9; hang++) {
			for(int dan=2; dan<=9; dan++) {
				if(hang==0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%d×%d=%d\t", dan, hang, dan*hang);
				}
			}
			System.out.println();
		}
		
	}
	
}
