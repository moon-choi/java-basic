package javaStudy;

import java.util.Arrays;

public class ArrayWithFor {

	public static void main(String[] args) {
		int [] arr = new int[100];
		arr[0] = 1;
		arr[1] = 2;
	
		//배열에 1~100까지 값 할당하기 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;	
		}
		System.out.println(Arrays.toString(arr)); //배열 출력하려면 Arrays.toString()
		
		//배열의 모든 값 더하기 
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
