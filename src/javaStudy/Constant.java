package javaStudy;

public class Constant {

	public static void main(String[] args) {
		//변수 선언 
		int i;
		i = 10;
		i = 5;
		
		//상수 선언
		final int J; //상수는 시작을 대문자로 명명.
		J = 10;
//		J = 5; //불가능.
		
		 double circleArea; //변수 
		 final double PI = 3.14159; //상수 
		 circleArea = 3 * 3 * PI;
	
		 final int OIL_PRICE = 1450; //상수 선언은 여러글자는 _ 로 분리. 
		 int totalPrice = 50 * OIL_PRICE;
	}

}
