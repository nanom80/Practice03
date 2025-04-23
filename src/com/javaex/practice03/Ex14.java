package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		long result = 0;
		
		for(int i=1; i<=num; i++) {
			result = result + i;
			if(i>1) System.out.print("+");
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("결과값: "+result);
		
		sc.close();
	}
}
