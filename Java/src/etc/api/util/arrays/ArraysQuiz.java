package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {
	
	public static String solution(String[] participant, String[] completion) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 1명이라고 가정합니다.
        */
		
		// 강사님이랑 작성한 것
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		// 정렬 후 중복이 아닌 부분을 찾는 포문
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		// for문을 다 돌았는데 리턴값이 없다면 마지막 인덱스가 중복이 아님
		return participant[participant.length-1];
		
		/* 내가 한거
		int idx = 0;
		
		for(int i=0; i<completion.length; i++) {
			for(int j=0; j<participant.length; j++) {
				boolean com = false;
				if(participant[j] == completion[i]) {
					com = true;
					i++;
				}
				if(!com) {
					idx = j;
				}
			}
		}
		return participant[idx];
		*/
	}
	
	public static void main(String[] args) {
		
		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
		
		System.out.println("완주하지 못한 자 : " + solution(participant, completion));
		
	}

}
