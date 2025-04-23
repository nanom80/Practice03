package com.javaex.practice03;

import java.util.Scanner;
import java.util.Random;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int DeterminedNumber = rand.nextInt(100);
		System.out.println("DeterminedNumber: "+DeterminedNumber);
		int num = 0;
		String yn = "";
		
		System.out.println("=========================");
		System.out.println(" [숫자 맞추기 게임 시작]");
		System.out.println("=========================");
		
		while(true) {
			
			System.out.print(">>");
			
			// 숫자 입력 예외 처리
            if (!sc.hasNextInt()) {
                System.out.println("숫자만 입력 가능합니다. 다시 시도하세요.");
                sc.nextLine(); // 잘못된 입력 제거
                continue;
            }
            
			num = sc.nextInt();
			
			if(num < DeterminedNumber) {
				System.out.println("더 높게");
			}else if(num > DeterminedNumber) {
				System.out.println("더 낮게");
			}else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) ");
				sc.nextLine(); //버퍼 비우기
				yn = sc.nextLine();
				if(yn.equals("y") || yn.equals("Y")) {
					break;
				}
			}
		}
		
		System.out.println("=========================");
		System.out.println(" [숫자 맞추기 게임 종료]");
		System.out.println("=========================");
		
		sc.close();
	}
}
