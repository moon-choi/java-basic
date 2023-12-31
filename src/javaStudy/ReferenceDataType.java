package javaStudy;

public class ReferenceDataType {

	public static void main(String[] args) {
		int i = 4; //기본형 변수 
		
		String str = new String("Hello"); //참조형 변수: String 클래스. 

		System.out.println(str); //주소 A
		System.out.println(new String("Hello")); //새 인스턴스 만듦. 주소 B
		System.out.println(str == new String("Hello")); //false -> 이건 참조값 비교함. (주소지가 다름 A!=B) ***
		System.out.println(str.equals(new String("Hello"))); //true -> 이건 값만 비교함. (주소 내용은 같음)
		
		/*
		 == 는 참조값(주소)비교 | equals는 값 비교.
	
		- new 키워드: "클래스를 메모리에 올려주세요" 
		- 메모리에 올라간 클래스는 인스턴스.
		- 메모리에 올라간 클래스를 참조하는 변수가 str임. 
		- 변수는 인스턴스를 가지는 게 아니라 가리키고 있는 것임.(참조)
		- str은 다른 메모리 영역에 있고, String instance Hello를 가리킴.
		- 메모리에 있는 Hello의 "위치값"이 변수 str에 저장됌. 
		- 모든 클래스는 참조형임!
		 */
	}

}
