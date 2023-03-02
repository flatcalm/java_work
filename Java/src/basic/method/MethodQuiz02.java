package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {
	
	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	// 배열의 맨 마지막 위치에 데이터를 추가하는 함수
	// 기존 배열보다 크기가 하나 큰 배열 선언해서 값 고대로 내리기
	// 매개값으로 온 값을 마지막에 채우기.
	static void push(String newFood) {
		String[] temp = new String[foods.length+1];
		
		for(int i=0; i<foods.length; i++) {
			temp[i] = foods[i];
		}
		
		temp[foods.length] = newFood;
		
		foods = temp;
		temp = null;
		
	}
	
	// 배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	// 배열 내의 특정 음식의 위치를 찾아주는 함수
	// 반복문 이용해서 돌리면 됩니다.
	static int indexOf(String targetName) {
//		int idx=0; // 내가 한거
//		for(int i=0; i<foods.length; i++) {
//			if(targetName.equals(foods[i])) {
//				idx=i;
//				break;
//			} else if(i == foods.length-1) {
//				idx = -1;
//				break;
//			}
//		}
//		return idx;
		
		for(int i=0; i<foods.length; i++) {
			if(targetName.equals(foods[i])) {
				return i;
			}
		}
		return -1;
	}
	
	// 특정 음식의 배열 포함 여부 ( 참 / 거짓)
	// indexOf의 리턴값으로 판단하여 리턴.
	static boolean inculde(String targetName) {
//		boolean flag = false;
//		if(indexOf(targetName)==-1) {
//			
//		} else {
//			flag = true;
//		}
//		return flag;
		return indexOf(targetName) != -1;
	}
	
	// 특정 음식 제거 함수
	// 앞에서 진행한 배열의 삭제 로직.
	static void remove(String targetName) {
//		for(int i=0; i<foods.length; i++) {
//			if(inculde(targetName)) {
//				for(int j=indexOf(targetName); j<foods.length-1; j++) {
//					foods[j] = foods[j+1];
//				}
//				break;
//
//			} 
//		}
		
//		if(inculde(targetName)) { // 내가 한거
//			for(int i=indexOf(targetName); i<foods.length-1; i++) {
//				foods[i] = foods[i+1];
//			}
//		}
//		
//		
//		if(!inculde(targetName)) {
//			System.out.println(targetName + "은(는) 존재하지 않는 음식명입니다.");
//		} else {
//			String[] temp = new String[foods.length-1];
//			for(int i=0; i<foods.length-1; i++) {
//				temp[i] = foods[i];				
//			}
//			foods = temp;
//			temp = null;				
//		}
		
		int idx = indexOf(targetName);
		if(idx == -1) {
			System.out.println("존재하지 않는 음식명입니다.");
		} else {
			for(int i=idx; i<foods.length-1; i++) {
				foods[i] = foods[i+1];
			}
			String[] temp = new String[foods.length-1];
			for(int j=0; j<temp.length; j++) {
				temp[j] = foods[j];
			}
			foods = temp;
		}

	}
	
	// 특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		foods[targetIdx] = newFood;
	}
	

	public static void main(String[] args) {
		
		printFood(); // 원본 출력
		push("라면");
		push("김치찌개");
		printFood();
		
		// 파스타의 인덱스를 알아내세요.
		System.out.println("파스타의 인덱스 : " + indexOf("파스타"));
		// 김치찌개의 인덱스를 알아내세요.
		System.out.println("김치찌개의 인덱스 : " + indexOf("김치찌개"));
		// 짜장면의 인덱스를 알아내세요. -> -1을 리턴하시면 됩니다.
		System.out.println("짜장면의 인덱스 : " + indexOf("짜장면"));
		remove("김치찌개");
		
		printFood(); // 김치찌개가 삭제되었는지 확인.
		
		remove("망고"); // 존재하지 않는 음식명입니다 출력.
		
		// 라면의 존재 여부
		if(inculde("라면")) {
			System.out.println("라면은 존재합니다.");
		} else {
			System.out.println("라면은 없습니다.");
		}
		// 양념치킨의 존재 여부
		if(inculde("양념치킨")) {
			System.out.println("양념치킨은 존재합니다.");
		} else {
			System.out.println("양념치킨은 없습니다.");
		}
		
		// 2번 인덱스 데이터를 닭갈비로 수정.
		modify(2, "닭갈비");
		printFood(); // 닭갈비가 수정되었는지 확인.
		
		
	}

}
