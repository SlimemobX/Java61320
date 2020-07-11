package com.syntax.class19;

public class InClassTask1 {
	
	public static void main(String[] args) {
		
		System.out.println("------sum of an array-------");
		
		InClassTask19 task1 = new InClassTask19();
		
		int[] arrays = { 5, 9, 10, 11, 7 };
		int outcome = task1.arr(arrays);
		System.out.println("The sum is = "+ outcome);
		
		
		System.out.println("----------String reverse-------------");
		
		String reversed = InClassTask19.words("Goodbye");
		
		System.out.println(reversed);
		
		
	}
}
