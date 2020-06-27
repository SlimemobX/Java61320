package com.syntax.class13;

public class Roll {
	public static void main(String[] args) {
		Main dog1 = new Main();
		dog1.breed = "Husky";
		dog1.name = "Spike";
		dog1.color = "White";

		dog1.bark();
		dog1.run();
		dog1.play();

		Main dog2 = new Main();
		dog2.breed = "Bulldog";
		dog2.name = "Chico";
		dog2.color = "Black";

		dog2.bark();
		dog2.run();
		dog2.play();

		Main dog3 = new Main();
		dog3.breed = "Labrador";
		dog3.name = "Leo";
		dog3.color = "Brown";

		dog3.bark();
		dog3.run();
		dog3.play();

	}

}
