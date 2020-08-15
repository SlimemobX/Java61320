package com.syntax.class32_HWCW;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.syntax.class32.Animal;

import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {

		Map<Integer, Person> person = new TreeMap<>();

		person.put(1, new Person("James", "Bond", 37, 400000));
		person.put(2, new Person("Mary", "Jane", 28, 90000));
		person.put(3, new Person("Benjamin", "Smith", 23, 120000));
		person.put(4, new Person("Zachary", "Miller", 50, 355000));
		person.put(5, new Person("Albert", "Pennyworth", 19, 55000));
		person.put(6, new Person("Cristiano", "Ronaldo", 35, 900000));

		System.out.println("1. ------------------Using EntrySet----------------");
		Set<Entry<Integer, Person>> entries = person.entrySet();

		System.out.println("-----------Enhanced loop EntrySet----------");
		for (Entry<Integer, Person> e : entries) {
			Person per = e.getValue();
			per.display();
		}

		System.out.println("---------------------Iterator EntrySet----------------------------");
		Iterator<Entry<Integer, Person>> it = entries.iterator();

		while (it.hasNext()) {
			Entry<Integer, Person> ent = it.next();
			Person value = ent.getValue();
			value.display();
		}
		System.out.println();

		System.out.println("2. ------------------Using Values()----------------");
		Collection<Person> val = person.values();

		System.out.println("-----------Enhanced loop values()----------");
		for (Person v : val) {
			v.display();
		}

		System.out.println("---------------------Iterator Values()----------------------------");
		Iterator<Person> values = val.iterator();
		while (values.hasNext()) {
			Person va = values.next();
			va.display();
		}
		System.out.println();

		System.out.println("3. ------------------Using Key()----------------");
		Set<Integer> keys = person.keySet();

		System.out.println("-----------Enhanced loop Key()----------");
		for(int key: keys) {
			Person values1 = person.get(key);
			values1.display();
		}

		System.out.println("---------------------Iterator Key()----------------------------");
		Iterator<Integer> iterator=keys.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Person value = person.get(key);
			value.display();
		}
	}

}
