package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(i%5==0) {
				cnt++;
				sum += i;
			}
		}
		
		System.out.println("5의 배수의 개수: "+cnt);
		System.out.println("5의 배수의 합  : "+sum);
		
		sc.close();
	}
}
