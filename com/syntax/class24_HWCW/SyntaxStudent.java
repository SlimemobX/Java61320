package com.syntax.class24_HWCW;

public class SyntaxStudent extends Student{
	public void IT() {
		System.out.println("Learn about Java");
	}
	
	public void study() {
		System.out.println("Syntax students need to study a lot");
	}

	public void exams() {
		System.out.println("Need more exams ");
	}
	

}



class CollegeStudent extends Student{
	public void schedule(){
		System.out.println("Choose any schedule");
	}
	
	public void study() {
		System.out.println("College students study less than Syntax");
	}

	public void exams() {
		System.out.println("Cellege students have a lot of exams");
	}
	
}


class SchoolStudent extends Student{
	
	public void sleepy() {
		System.out.println("Students allways go home and go to sleep");
	}
	
	public void study() {
		System.out.println("Students don't study much");
	}

	public void exams() {
		System.out.println("They have a lot of exams too");
	}
	
}
