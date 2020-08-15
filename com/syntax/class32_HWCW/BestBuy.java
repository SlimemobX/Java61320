package com.syntax.class32_HWCW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BestBuy {
	
	public static void main(String[] args) {
		
//		Create a map of Best Buy store. Place
//		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//		Retrieve all keys and values from a Best Buy map using EntrySet.


		Map<Integer, String> items = new HashMap<>();
		items.put(84390832, "PS4");
		items.put(84549333, "XboxOne");
		items.put(59483933, "Switch");
		items.put(13948439, "MacBook Air");
		items.put(48734599, "Samsung TV");
		
		System.out.println(items);
		
		Set<Entry<Integer,String>> item = items.entrySet();
		System.out.println(item);
		
		
		System.out.println("----------Using for Loop----------");
		
		for(Entry<Integer,String> it : item) {
			System.out.println(it.getKey() + " = " + it.getValue());
		}
		
		System.out.println("----------Using Iterator------------");

		Iterator<Entry<Integer,String>> ite = item.iterator();
		while(ite.hasNext()) {
			Entry<Integer,String> entry = ite.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}






		


		

	}

}
