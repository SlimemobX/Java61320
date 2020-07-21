package com.syntax.class25_HWCW;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer[] comp = { new Apple("Apple", "Safari"), new Lenovo("Lenovo","Windows"),
				new HP("HP","Chrome"), new Dell("Dell","Internet Explorer")};
		
		
		
		int size = comp.length;
		System.out.println(size);
		
		for (Computer com:comp) {
			com.internet();
			com.work();
			System.out.println("---------------------");
		}
		
		
	}

}
