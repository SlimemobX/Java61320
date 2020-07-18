package com.syntax.class24;

public class Recap {
	
	protected void bye() {
		System.out.println("bye");
	}
	
	protected void bye(String str, int num) {
		System.out.println(str);
	}
	
	
	protected void bye(int num, String str) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Recap cap = new Recap();
		
		cap.bye(1,"1");
		cap.bye("1",1);
	}
	
}
