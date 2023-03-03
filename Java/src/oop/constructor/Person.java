package oop.constructor;

public class Person {
	
	String name;
	int age;
	int height;
	
	void info() {
		
		System.out.printf("*** %s님의 정보 ***%n", name);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		
	}
	
	Person() {}
	
	Person(String pName, int pAge, int pHeight) {
		name = pName;
		age = pAge;
		height = pHeight;
	}
	
	
	
}
