package javaStudy;

public class MethodOverloadRunner {

	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		
		System.out.println(mo.plus("a", "b", "c"));
		System.out.println(mo.plus(1, 2, 3));
		System.out.println(mo.plus(1, 2));
	}

}