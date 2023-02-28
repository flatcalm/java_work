package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		// 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		// (48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		
		int i = 48; // begin
		
		while(i <= 150) { // end
			if(i % 8 == 0) {
				System.out.print(i + " ");
			}
			i++; // step
		}
		
		/*
		int n = 48;
		
		while(n <= 150) {
			System.out.print(n + " ");
			n += 8;
		}
		*/
		
		System.out.println();
		
		// 1 ~ 100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int x = 1; // begin
		
		while(x <= 100) { // end
			if(x % 4 == 0 && x % 8 != 0) {
				System.out.print(x + " ");
			}
			
//			if(x % 4 == 0) {
//				if(x % 8 != 0) {
//					System.out.print(x + " ");
//				}
//			}
			
			x++; // step
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		// 1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력.
		
		int y = 1, count1 = 0;
		
		while(y <= 30000) {
			if(y % 258 == 0) {
				count1 += 1;
			}
			y++;
		}
		
		System.out.println("1 ~ 30000까지 258의 배수의 개수 : " + count1 + "개");		
		
		
		// 1000의 약수의 개수를 구하세요.
		// 1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		// 그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int z = 1, count2 = 0;
		
		while(z <= 1000) {
			if(1000 % z == 0) {
				count2 += 1;
			}
			z++;
		}
		
		System.out.println("1 ~ 1000까지 1000의 약수의 개수 : " + count2 + "개");
		
	}

}
