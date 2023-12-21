package javaStudy;

public class Bus extends Car {

	//drive 메소드는 없지만 부모인 Car클래스로부터 상속받음.
	public void beep() {
		System.out.println("let's beep");
	}
	
	public void drive() {
		super.drive(); //부모의 메소드 호출 
		System.out.println("let's drive a bus"); //자식의 메소드 호
	}
}