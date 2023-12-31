package javaStudy;

public class MyClass {

	/*
	public 리턴타입 메소드명 (매개변수) {
		구현 
	}
	*/
 
	//유형 1. 리턴 x, 매개변수 x
	public void method1() {
		System.out.println("method 1 run");
	}
	
	//유형 2. 리턴 x, 매개변수 o
	public void method2(int a) {
		System.out.println("method 2 run " + a);
	}
	
	//유형 3. 리턴 o, 매개변수 x
	public int method3() {
		System.out.println("method 3 run");
		return 10;
	}
	
	//유형 4. 리턴 x, 매개변수 o
	public void method4(int a, int b) {
		System.out.println("method 4 run " + (a + b));
	}
	
	//유형 5. 리턴 o, 매개변수 o
	public int method5(int a) {
		System.out.println("method 5 run");
		return a * 2;
	}
	
}
