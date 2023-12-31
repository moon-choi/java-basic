package javaStudy;

public class AccessObj {
	
	/* 접근제한자
	 public > protected > default > private
	 - public: 전체공개
	 - protected: 같은 패키지인 경우 접근 허용. 다른 패키지는 상속 받은 경우 접근 허용. 
	 - default: 나와 같은 패키지만. 
	 - private: 나 자신만 접근 가능.
	 */
	
	public int pub = 3;
	protected int prot = 4;
	int def = 2;
	private int priv = 1;
	
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.priv); //가능 
	}
}
