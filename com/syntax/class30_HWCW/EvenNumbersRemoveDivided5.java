package com.syntax.class30_HWCW;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbersRemoveDivided5 {
	public static void main(String[] args) {
		
		// Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
		
		ArrayList<Integer> num = new ArrayList<>();
		
		for (int i = 2; i<= 50; i++) {
			if (i%2 == 0) {
				num.add(i);
			}
		}
		System.out.println("Even numbers = " + num);
		
		Iterator<Integer> numbersIt = num.iterator();
		while(numbersIt.hasNext()) {
			if (numbersIt.next() % 5 == 0) {
				numbersIt.remove();
			}
		}
		
		System.out.println("Removing even numbers divisible by 5 = " + num);
		
		
	}

}
