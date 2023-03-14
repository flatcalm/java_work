package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {
		
		/*
        1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230314file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
        */
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		String nowTime = ldt.format(dtf);
		
		File dateFolder = new File("C:\\work\\file\\" + nowTime + "file");
		
		if(!dateFolder.exists()) {
			dateFolder.mkdirs();
			System.out.println(nowTime + "file 폴더 생성 완료!");
		} else {
			System.out.println(nowTime + "file 폴더가 이미 존재합니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String fileName = null;
		String text = "";
		
		System.out.print("파일명을 입력해주세요 : ");
		fileName = sc.nextLine();
		
		try {
			fw = new FileWriter("C:\\work\\file\\" + nowTime + "file\\" + fileName + ".txt");
			bw = new BufferedWriter(fw);
			System.out.println(fileName + " 파일 생성 완료!");
			
			System.out.println("작성을 그만두려면 그만을 입력해주세요.");
			
			while(true) {
				System.out.print(fileName + " 파일에 작성할 내용을 입력해주세요 : ");
				String input = sc.next(); 
				if(input.equals("그만") | input.equals("rmaks")) {
					System.out.println(fileName + " 파일 작성을 종료합니다.");
					
					break;
				}
				
				text += (input + "\r\n");
				
				System.out.println(fileName + " 파일에 " + input + " 내용이 입력되었습니다.");
			}
			
			bw.write(text);
			System.out.println(fileName + " 파일 작성 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		////////// 파일 읽기 //////////
		try {
			fr = new FileReader("C:\\work\\file\\" + nowTime + "file\\" + fileName + ".txt");
			br = new BufferedReader(fr);
			
			String read;
			
			System.out.println(fileName + " 파일을 읽습니다.");
			
			while((read = br.readLine()) != null) {
				System.out.println(read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
