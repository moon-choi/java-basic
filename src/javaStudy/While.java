package javaStudy;

public class While {

	public static void main(String[] args) {
		int i = 0;

		while (i < 10) {
			System.out.println("loop " + i);
			i++; // while을 끝나게 해주는 조건
		}

		int x = 0;
		int total = 0;
		while (x <= 100) {
			total += x;
			x++; // while을 끝나게 해주는 조건
		}
		System.out.println(total);
	}
}
