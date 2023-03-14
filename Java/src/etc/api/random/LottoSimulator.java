package etc.api.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();
	
	static int prize1 = 0; // 1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; // 2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; // 3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; // 4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; // 5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; // 꽝 당첨 횟수를 세 줄 변수
	
	public static Set<Integer> createLotto() {
		
		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		  컬렉션 자료형에 모아서 리턴해 주세요.
		  무엇을 쓰든 상관하지 않겠습니다.
		  중복이 발생하면 안됩니다.
		 */	
		
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		return lotto;
		
	}
	
	// 보너스 번호를 생성하는 메서드
	public static int createBonusNum(Set<Integer> lotto) {

		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후 
		 	당첨 번호들을 피해서 보너스 번호 하나만 뽑아 주세요. 
		 	범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */
		int bonus;

		while(true) {
			bonus = r.nextInt(45) + 1;
			if(lotto.contains(bonus)) {
				continue;
			} else {
				break;
			}
		}
		return bonus;
	}
	
	// 당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(Set<Integer> lotto, Set<Integer> myLotto, int bonus) {
		
		/*
		 - 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스 번호를 받습니다.
		 	내 로또 번호와 당첨 번호를 비교하여 
		 	일치하는 횟수를 세 주신 후 등수를 판단하세요.
		 	판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
		 	6개 일치 -> 1등
		 	5개 일치 + 보너스 번호 일치 -> 1등
		 	5개 일치 -> 3등
		 	4개 일치 -> 4등
		 	3개 일치 -> 5등
		 	나머지 -> 꽝
		 */
		int count =  0;
		
		ArrayList<Integer> lottoList = new ArrayList<>(lotto);
		ArrayList<Integer> myLottoList = new ArrayList<>(myLotto);
		Collections.sort(lottoList);
		Collections.sort(myLottoList);
		
		for(int i=0; i<lottoList.size(); i++) {
			for(int j=0; j<myLottoList.size(); j++) {
				if(lottoList.get(i)==myLottoList.get(j)) {
					count++;
				} else {
					continue;
				}
			}
		}
		if(count==6) prize1++;
		else if(count==5) {
			for(int i=0; i<myLottoList.size(); i++) {
				if(myLottoList.get(i) == bonus) {
					prize2++;
				} else {
					prize3++;
				}
			}
		}
		else if(count==4) prize4++;
		else if(count==3) prize5++;
		else failCnt++;
	}
	
	
	public static void main(String[] args) {
		
		// 로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		Set<Integer> winNum = createLotto();
		System.out.println("당첨 번호 : " + winNum);
		// 보너스 번호도 하나 고정시키세요.
		int bonus = createBonusNum(winNum);
		System.out.println("보너스 번호 : " + bonus);
		
		long cost = 0;
		
		while(true) {
			
			/*
			 - 1등이 당첨 될 때까지 반목문을 돌립니다.
			 - 1등이 당첨 된다면, 1등이 되기까지의 누적 당첨 횟수를 출력하고 
			 	반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */
			
//			System.out.println("로또를 구매합니다.");
			Set<Integer> myLotto = createLotto();
			cost += 1000;
			
			checkLottoNumber(winNum, myLotto, bonus);
			
			if(prize1 == 1) break;
		}
		
		System.out.println("축하합니다! 1등에 당첨되셨습니다!");
		System.out.printf("누적 당첨 횟수\n2등 : %d\n3등 : %d\n4등 : %d\n5등 : %d\n꽝 : %d\n"
				, prize2, prize3, prize4, prize5, failCnt);
		System.out.println("로또 구입한 총 비용 : " + cost);
		
	}

}
