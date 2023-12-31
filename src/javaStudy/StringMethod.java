package javaStudy;

public class StringMethod {

	public static void main(String[] args) {
		String str = new String ("hello");
		String _str = "hello"; //스트링은 많이쓰여서 예외적으로 이렇게 인스턴스 생성 가능함. 
		System.out.println(str.length());
		System.out.println(str.concat(" world")); 
		//str과 str.concat에서 두 str은 같은 참조값 가리키고 있는 상태임.
		System.out.println(str); //hello
		//str.concat 하면 자바는 hello world 라는 스트링 객체를 새로 만들어냄.
		//str이 가리키고 있는 레퍼런스는 그대로임. 
		//스트링 객체는 메소드 실행해도 값 바뀌지 않고 유지함. (불변 클래스)
		
		str = str.concat(" world 2"); 
		//이렇게 할당 해야 str은 str.concat과 같은 참조값 (hello world 2)를 가리키도록 바뀜. 
		System.out.println(str); //hello world 2
		
		System.out.println(str.substring(6)); //시작 인덱스부터 끝까지 잘라줘세요.
		System.out.println(str.substring(6, 7));
	}

}
