package com.greedy.practice.cafe;

public class Cashier {
	private boolean order;

	private Barista bar = new Barista();

	public  void call() {
		if(order) {
			System.out.println("잠시만 기다려주세요.");	
		}else {
			this.order = true;
			System.out.println("네 고객님.");
			
		}
	}

	public void choise() {
		if(order) {
			
			System.out.println("무엇을 도와드릴까요?");
		}else {
			System.out.println("주문 도와드리겠습니다.");
		}
	}
	public void order() {
		if(this.order) {
			System.out.println("금방 만들어드리겠습니다.");

//			System.out.println("진동벨이 울리면 찾으러 오시면 됩니다.");
			System.out.println("바리스타님 커피 주문 들어왔습니다.");
			bar.order();
//			System.out.println(" 네 커피 준비하겠습니다.");
			this.order = false;
		}else {	
			this.order =true;
			bar.order();
//		System.out.println("커피 나왔습니다.");
			System.out.println("커피값은 1500원 입니다.");
		}

	}
}
