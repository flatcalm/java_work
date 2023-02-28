package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {	// 게임 시작 전까지 혼자 작성
								// 게임 시작 부분은 막히는 부분 강사님꺼 참고해서 다시 작성 복습 필요

	public static void main(String[] args) {
		
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== 러시안 룰렛 게임 ==========");
		
		int numberPlayer;
		int numBullet;
		
		// 게임 인원 입력
		System.out.println("게임을 플레이할 인원을 입력해주세요. (2 ~ 4명)");
		while(true) {
			System.out.print("> ");
			numberPlayer = sc.nextInt();
			if(numberPlayer <= 4 && numberPlayer >= 2) {
				System.out.printf("플레이 인원이 %d명으로 설정되었습니다.%n", numberPlayer);
				break;
			} else {
				System.out.println("인원을 잘못 입력하셨습니다.");
				System.out.println("플레이 인원을 다시 입력해 주세요.");
			}
		}
		
		// 플레이어 이름 등록하고
		// 배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		// 배열의 크기는 게임 참가자의 명수와 동일합니다.
		String playerNames[] = new String[numberPlayer];
		System.out.println("플레이어 이름을 등록합니다.");
		for(int i=0; i<numberPlayer; i++) {
			System.out.print(i+1 + "번째로 등록할 플레이어 이름을 입력해주세요 : ");
			String playerName = sc.next();
			playerNames[i] = playerName;
		}
		System.out.println("플레이어 등록을 성공했습니다.");
		System.out.print("등록된 플레이어 : ");
		System.out.println(Arrays.toString(playerNames));
		
		// 실탄 개수 입력 (1 미만이면 안되고, 5 초과도 안됩니다.)
		System.out.println("실탄 개수를 설정합니다.");
		System.out.println("게임에 사용할 실탄 개수를 입력해주세요.");
		
		while(true) {
			System.out.print("> ");
			numBullet = sc.nextInt();
			if(numBullet > 5 || numBullet < 1) {
				System.out.println("실탄은 1 ~ 5개로 설정 가능합니다.");
				System.out.println("실탄 개수를 다시 입력해 주세요.");
			} else {
				System.out.printf("실탄 개수가 %d개로 설정되었습니다.%n", numBullet);
				
				break;
			}
		}
		System.out.println("실탄 개수 = " + numBullet); // 실탄 개수 확인
		// 실탄을 탄창에 배치합니다.
		boolean[] bulletPos = new boolean[6];
		
		// 난수를 생성하셔서 실탄을 탄창에 배치합니다.
		// false -> true로 바꾸는 것이 실탄 장전입니다.
		// 난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서 
		// 같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		while(true) {
			for(int i=0; i<numBullet; i++) {
			int bullet = (int) (Math.random()*bulletPos.length);
				if(bulletPos[bullet]) {
					i--;
					continue;
				} else {
					bulletPos[bullet] = true;
				}
			}
			break;
		}
		System.out.println(Arrays.toString(bulletPos)); // 장전이 실탄 개수만큼 잘 되었는지 확인
		
		// 실행 순서 정하기
		// 난수를 이용해서 실행 순서를 정합니다.
		// 시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		// 아예 배치를 섞으셔도 상관없습니다.
		System.out.println("게임 순서를 정합니다.");
		int idx = (int) (Math.random()*numberPlayer);
		System.out.println("첫 번째 플레이어는 " + playerNames[idx] + "입니다.");
		System.out.println("게임을 시작하겠습니다.");
		
		// 일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		// 이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		// 따로 변수를 선언하지 않습니다.
		sc.nextLine();
		
		// 최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		// 또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		// 총알을 소모하면 true값을 false로 변경해 주세요.
		// 사람이 한 명 아웃되면 배열의 크기를 줄여 주세요. 
		int bidx=0; // 탄창 순서를 카운트할 값
		while(true) {
			System.out.println(playerNames[idx] + "의 턴");
			System.out.println("Enter를 입력하면 격발합니다.");
			sc.nextLine();
			//			System.out.println("게임 시작"); // 게임 시작 되는지 테스트
			if(bulletPos[bidx]) {

				System.out.println("탕!");
				System.out.println(playerNames[idx] + "(이)가 사망했습니다.");
				numBullet--;
				numberPlayer--;
				bulletPos[bidx] = false;

				for(int i=idx; i<playerNames.length-1; i++) {
					playerNames[i] = playerNames[i+1];
				}

				String[] temp = new String[numberPlayer];

				for(int j=0; j<temp.length; j++) {
					temp[j] = playerNames[j];
				}
				playerNames = temp;
				temp = null;

				if(playerNames.length == 1) {
					System.out.println("남은 총알 수 : " + numBullet);
					System.out.println("최종 생존자 : " + playerNames[0]);
					System.out.println("게임을 종료합니다.");
					break;
				} else if(numBullet == 0) {
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("최종 생존자 : " + Arrays.toString(playerNames));
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("남은 총알 수 : " + numBullet);
					System.out.println("생존 인원 : " + Arrays.toString(playerNames));
					System.out.println("남은 인원이 게임을 재개합니다.");

					sc.nextLine();
				}

			} else {
				bulletPos[bidx] = false;
				System.out.println(playerNames[idx] + "(이)가 살아남았습니다.");
				System.out.println("남은 총알 수 : " + numBullet);
				System.out.println("생존 인원 : " + Arrays.toString(playerNames));
				System.out.println("남은 인원이 게임을 재개합니다.");
				idx++;

			}
			if(idx == numberPlayer) {
				idx = 0;
			}

			bidx++;

			//				System.out.println(Arrays.toString(bulletPos)); // 실탄이 줄어들었는지 확인
			//				System.out.println(Arrays.toString(playerNames)); // 죽은 플레이어가 삭제되었는지 확인
		}
		sc.close();
	}

}
