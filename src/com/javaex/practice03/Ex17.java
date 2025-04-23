package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int k=2; k<=num; k++) {
			for(int l=1; l<=k; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
