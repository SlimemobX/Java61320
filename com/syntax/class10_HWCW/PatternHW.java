package com.syntax.class10_HWCW;

public class PatternHW {
	public static void main(String[] args) {
		// Please print the following pattern
		// 54321
		// 4321
		// 321
		// 21
		// 1
	

        for(int i = 5; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("============================");
	
	
        
        // This is extra
        // 1
        // 21
        // 321
        // 4321
        // 54321
     	// 4321
     	// 321
   		// 21
   		// 1
        
        
        for (int a = 1; a <= 4; a++) {

			for (int b = a; b >= 1; b--) {
				System.out.print(b);
			}
		
			
		System.out.println();
		}
	
        for(int c = 5; c >= 1; c--) {
            for(int d = c; d >= 1; d--) {
                System.out.print(d);
            }
            System.out.println();
        }
	
	
	}

	

}
