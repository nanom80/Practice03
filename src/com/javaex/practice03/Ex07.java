package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		
		for(int j=1; j<=i; j++) {
			
			int k = 0;
			
			while(true) {
				System.out.print(j);
				k++;
				if(j==k) break;
			}
			
			System.out.println("");
		}
		
		sc.close();
		
	}
}
