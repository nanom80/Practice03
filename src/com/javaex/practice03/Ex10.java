package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 5개를 입력해주세요");
	    System.out.print("숫자1: ");
	    int num1 = sc.nextInt();
	    System.out.print("숫자2: ");
	    int num2 = sc.nextInt();
	    System.out.print("숫자3: ");
	    int num3 = sc.nextInt();
	    System.out.print("숫자4: ");
	    int num4 = sc.nextInt();
	    System.out.print("숫자5: ");
	    int num5 = sc.nextInt();
	    
	    int maxNum = num1;
	    
	    if(num2 > maxNum) maxNum = num2;
	    if(num3 > maxNum) maxNum = num3;
	    if(num4 > maxNum) maxNum = num4;
	    if(num5 > maxNum) maxNum = num5;
	    
	    System.out.println("가장 큰 수는 "+maxNum+" 입니다.");
	    
		sc.close();
	}
}
