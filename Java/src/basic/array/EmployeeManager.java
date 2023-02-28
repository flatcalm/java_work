package basic.array;

import java.util.Scanner;

public class EmployeeManager { // 현중이 삼촌께 설명 듣고 혼자 작성한 것

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 사원의 정보 : 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		// 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		
		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("=====================================");
			
			System.out.print("> ");
			int menu = sc.nextInt();
			
			boolean flag = false;
			
			String userNum = "";
			String name = "";
			int age = 0;
			String department = "";
			
			
			if(menu == 1) {	// 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
							// 사번은 중복되면 안됩니다.
                			// (무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
				while(true) {
					System.out.print("사번을 입력해주세요 : ");
					userNum = sc.next();


					for(int i=0; i<count; i++) {
						if(userNum.equals(userNums[i])) {
							System.out.println("이미 존재하는 사번입니다.");
							System.out.println("사번을 다시 입력해주세요.");
							flag = true;
							break;
						}
					}
					if(!flag) {
						userNums[count] = userNum;
						System.out.print("이름을 입력해주세요 : ");
						name = sc.next();
						names[count] = name;
						System.out.print("나이를 입력해주세요 : ");
						age = sc.nextInt();
						ages[count] = age;
						System.out.print("부서명을 입력해주세요 : ");
						department = sc.next();
						departments[count] = department;

						System.out.println("사원 등록에 성공하였습니다.");

						count++;

						break;
					}
					
					break;

				}
				
			} else if(menu == 2) {	// 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count) 
									// 만약 사용자가 사원 등록을 한 명도 하지 않았다면
									// "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				System.out.println("모든 사원 정보를 출력합니다.");
				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				} else if(count != 0){
					for(int i=0; i<count; i++) {
						System.out.printf("%d번째 사원 정보%n사번 : %s 이름 : %s 나이 : %d 부서명 : %s%n", i+1, userNums[i], names[i], ages[i], departments[i]);
					}
				}
			} else if(menu == 3) {	// 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
									// 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

				System.out.print("사번을 입력해주세요 : ");
				userNum = sc.next();

				for(int i=0; i<count; i++) {
					if(userNum.equals(userNums[i])) {
						System.out.println("검색 완료!");
						System.out.printf("사번 : %s 이름 : %s 나이 : %d 부서명 : %s%n", 
								userNums[i], names[i], ages[i], departments[i]);
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("존재하지 않는 사번입니다.");
					System.out.println("사번을 다시 입력해주세요.");
				}

			} else if(menu == 4) {	// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
									// 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
									// 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
									// 사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.print("정보를 변경할 사원의 사번을 입력해주세요 : ");
				userNum = sc.next();
				for(int i=0; i<count; i++) {
					if(userNum.equals(userNums[i])) {
						System.out.println(userNums[i] + "번 사원의 정보를 변경합니다.");
						System.out.println("1. 나이 변경 | 2. 부서 변경 | 3. 취소");
						System.out.print("> ");
						int j = sc.nextInt();
						if(j == 1) {
							System.out.print("변경할 나이를 입력해주세요 : ");
							age = sc.nextInt();
							ages[i] = age;

							System.out.printf("%s번 사원의 나이를 %d로 변경에 성공하였습니다.%n", userNums[i], ages[i]);
						} else if(j == 2) {
							System.out.print("변경할 부서명을 입력해주세요 : ");
							department = sc.next();
							departments[i] = department;

							System.out.printf("%s번 사원의 부서명을 %s로 변경에 성공하였습니다.%n", userNums[i], departments[i]);
						} else if(j == 3) {
							System.out.println("사원 정보 수정을 취소합니다.");
						} else {
							System.out.println("잘못 입력하셨습니다.");
							i--;
							continue;
						}

						flag = true;

						break;

					} 
				}
				if(!flag) {
					System.out.println("존재하지 않는 사번입니다.");
					System.out.println("사번을 다시 입력해주세요.");

					break;
				}

			} else if(menu == 5) {	// 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
									// 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
									// y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
									// 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
									// 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				int i;
				
				System.out.print("삭제할 사원의 사번을 입력해주세요 : ");
				userNum = sc.next();
				
				for(i=0; i<count; i++) {
					if(userNum.equals(userNums[i])) {
						System.out.println("정말 삭제하시겠습니까? [Y/N]");
						System.out.print("> ");
						String yn = sc.next();
						
						if(yn.equals("Y") || yn.equals("y")) {
							System.out.printf("%s번 사원의 삭제를 완료하였습니다.", userNums[i]);
							for(int j=i; j<count; j++) {
							userNums[j] = userNums[j+1];
							names[j] = names[j+1];
							ages[j] = ages[j+1];
							departments[j] = departments[j+1];
							}
							count--;
						} else if(yn.equals("N") || yn.equals("n")) {
							System.out.println("삭제를 취소합니다.");
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
						
						flag = true;
						
					}					
					
				}
				if(!flag) {
					System.out.println("존재하지 않는 사번입니다.");
					System.out.println("다시 입력해주세요.");
				}
				
			} else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
				
			
		} // end while true
		
	} //end main

}
