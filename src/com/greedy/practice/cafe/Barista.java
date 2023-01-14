package com.greedy.practice.cafe;

public class Barista {

	private boolean order=true;

	public void order() {
		if(order) {
			System.out.println("커피 준비하겠습니다.");
			this.order = false;

		}else {	
			this.order = true;
			System.out.println("커피 나왔습니다.");

		}

	}
}
