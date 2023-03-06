package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
//		my.year = 1992; (x)
		my.setYear(1992);
		
//		System.out.printf("내 생일은 %d년 입니다.\n", my.getYear("abc1234"));
		
		my.setMonth(2);
//		System.out.printf("내 생일은 %d월 입니다.\n", my.getMonth());
		
		my.setDay(20);
//		System.out.printf("내 생일은 %d일 입니다.\n", my.getDay());
		
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", my.getYear("abc1234"), my.getMonth(), my.getDay());
	}

}
