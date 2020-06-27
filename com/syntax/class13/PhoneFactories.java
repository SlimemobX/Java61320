package com.syntax.class13;

public class PhoneFactories {
	public static void main(String[] args) {

		System.out.println("--------------IPhone--------------");
		Phone iPhone = new Phone();
		iPhone.make = "iPhone";
		iPhone.model = "11 Pro";
		iPhone.operatingSystem = "iOS";
		iPhone.color = "Red";
		iPhone.screenSize = "6.1 inches";
		iPhone.storage = "128 GB";

		iPhone.call();
		iPhone.text();
		iPhone.playGames();
		iPhone.watchVideos();

		System.out.println("-----------------Android---------------");
		Phone android = new Phone();
		android.make = "Samsung";
		android.model = "Galaxy s10";
		android.operatingSystem = "Android";
		android.color = "Black";
		android.screenSize = "6.1 inches";
		android.storage = "128 GB";

		android.call();
		android.text();
		android.playGames();
		android.watchVideos();
		
		System.out.println("----------------Nokia----------------");
		Phone nokia = new Phone();
		nokia.make = "Nokia";
		nokia.model = "9 Pureview";
		nokia.operatingSystem = "Android 9";
		nokia.color = "Black";
		nokia.screenSize = "5.9 inches";
		nokia.storage = "128 GB";
		
		nokia.call();
		nokia.text();
		nokia.playGames();
		nokia.watchVideos();

	}

}
