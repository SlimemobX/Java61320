package com.syntax.class09;

public class PrintHours {
	public static void main(String[] args) {
		// let us print the clock
		// 00:00
		// 00:01
		// ........
		// 01:00
		// 01:01
		// ........
		// 23:58
		// 23:59
		// Hour goes from 0 to 24
		// minute goes from 0 to 59

//		for (int h = 0; h < 24; h++) {
//			for (int m = 0; m < 60; m++) {
//				if (m < 10) {
//					System.out.println(h + ":0" + m);
//				} else {
//					System.out.println(h + ":" + m);
//				}
//
//			 }
//		}
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					if (m < 10) {
						if (s < 10) {
						System.out.println(h + ":0" + m + ":0" + s);	
						}
					}else {
						System.out.println(h + ":" + m + ":" + s);	
					}
					
				}
			}
	
		}
	}

}
