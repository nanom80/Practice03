package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
	    int num = sc.nextInt();
	    int sum = 0;
	    
	    if(num%2==0) { //짝수
	    	for(int a=1; a<=num; a++) {
	    		if(a%2==0) {
	    			sum += a;
	    		}
	    	}
	    }else { //홀수
	    	for(int a=1; a<=num; a++) {
	    		if(a%2==1) {
	    			sum += a;
	    		}
	    	}
	    }
	    
	    System.out.println("결과값: "+sum);
	    
		sc.close();
	}
}
