package com.greedy.practice.cafe;

import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		/*손님이 카페에 왔습니다
		*손님이 캐셔에게 주문을 합니다
		*캐셔는 바리스타에게 주문을 전달합니다
		**/
		
		Customer cus = new Customer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==== 어서오세요 카페입니다 ====");
			System.out.println("1. 직원을 호출한다.");
			System.out.println("2. 메뉴를 고른다.");
			System.out.println("3. 주문을 한다.");
			System.out.println("4. 안녕히 가세요.");
			System.out.print("메뉴 선택 :");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : cus.call(); break;
			case 2 : cus.choise(); break;
			case 3 : cus.order(); break;
			case 4: System.out.println("안녕히 가세요. ");
			return;
			}
		}
	}

}
