package com.syntax.class17;

public class Repl108_119 {

	public static void main(String[] args) {

		System.out.println("----------Repl 118------------");
		Repl108_119 obj = new Repl108_119();
		System.out.println(obj.spaceOut("hello"));
		System.out.println(obj.spaceOut("technology"));

		System.out.println("----------Repl 119----------");
		Repl108_119 obj1 = new Repl108_119();
		System.out.println(obj1.censorLetter("computer science", 'e')); // "comput*r sci*nc*"
		System.out.println(obj1.censorLetter("trick or treat", 't')); // "*rick or *rea*"

	}

	// REPL 118
	String spaceOut(String str) {

		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			newString = newString + str.charAt(i) + " ";
		}

		return newString;
	}

	
	// REPL 119
	String censorLetter(String str, char c) {

		str = str.replace(c, '*');
		return str;
	}

}
