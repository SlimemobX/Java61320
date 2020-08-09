package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class AnimalsIntoMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Animal>  life = new LinkedHashMap<>(); 
		
		life.put(1, new Dog("German Shepard", "Black" ));
		life.put(2, new Zebra("Zebra", "Black and White" ));
		life.put(3, new Monkey("Mankey", "Beige" ));
		
		System.out.println("1. ------------------Using EntrySet----------------");
		Set<Entry<Integer,Animal>> entries = life.entrySet();
		
		System.out.println("---------Access all variables and call available methods of Animals-----------");
		
		System.out.println("-----------Enhanced loop EntrySet----------");
		for(Entry<Integer,Animal> e: entries) {
			Animal animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("-----------------");
		}
		
		
		System.out.println("---------------------Iterator EntrySet----------------------------");
		
		Iterator<Entry<Integer, Animal>> it = entries.iterator();
		
		while(it.hasNext()) {
			Entry<Integer, Animal> ent = it.next();
			Animal value = ent.getValue();
			System.out.println(value.type);
			System.out.println(value.color);
			value.eat();
			value.sleep();
			System.out.println("----------------");
			
		}
		
		
		
		System.out.println("2. ------------------Using Values()----------------");
		
		Collection<Animal> values = life.values();
		System.out.println("-----------Enhanced loop values()----------");
		for(Animal animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println();
		}
		
		System.out.println("---------------------Iterator Values()----------------------------");
		Iterator<Animal> val = values.iterator();
		while(val.hasNext()) {
			Animal v =val.next();
			System.out.println(v.type);
			System.out.println(v.color);
			v.eat();
			v.sleep();
			System.out.println();
		}
		
		
		System.out.println("3. ------------------Using Key()----------------");
		
		System.out.println("-----------Enhanced loop Key()----------");
		Set<Integer> keys = life.keySet();
		for(int key: keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("=======================");
		}
		
	
		System.out.println("---------------------Iterator Key()----------------------------");
		
		Iterator<Integer> iterator=keys.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("=======================");
			
			
		}
		
	}

}
