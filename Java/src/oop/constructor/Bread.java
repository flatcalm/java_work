package oop.constructor;

public class Bread {
	
	int price;
	String name;
	String ingredient;
	
	Bread() {
		price = 1000;
		name = "빵";
		ingredient = "재료";
	}
	
	Bread(int price1, String name1, String ingredient1) {
		price = price1;
		name = name1;
		ingredient = ingredient1;
	}
	
	void info() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵 이름 : " + name);
		System.out.println("빵 가격 : " + price);
		System.out.println("주 재료 : " + ingredient);
	}
	
}
