package com.syntax.class04;

public class NestedElseIf {
	public static void main(String[] args) {
		// if student completed the quiz we'll check the score
		// if score > 90 --> A, Great Job!
		// if score > 80 --> B, Well Done!
		// if score > 70 --> C, Just Passed!
		// otherwise --> F, You failed!
		//
		// is student didn't complete the quiz, Please finish your quiz
		
		boolean completed = true;
	    int score = 82; 
		
	    if (completed) {
	    	// Let's check the score
	    	if (score > 90) {
	    		System.out.println("A, Great Job!");
	    	}else if (score > 80) {
	    		System.out.println("B, Well Done");
	    	}else if (score > 70) {
	    		System.out.println("C, Just Passed!");
	    	}else {
	    		System.out.println("F, You Failed!");
	    	}
	    }else {
	    	System.out.println("Please fiish youe quiz");
	    }
	}

}
