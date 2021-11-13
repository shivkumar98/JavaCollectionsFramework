package com.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingSets {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("C++");
		set1.add("Python");
		set1.add("Java");
		set1.add("C#");
		set1.add("C");
		
		//basic loop

		for (Iterator<String> iterator = set1.iterator();iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		//ehancedloop
		for (String s : set1) {
			System.out.println(s);
		}
		
		//while loop
		Iterator iterator1 =set1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		// for each using lambda
		set1.forEach(element -> {
			System.out.println(element);
		});
		
		//using streams
		set1.stream().filter(element -> !element.equals("Python")).forEach(element -> System.out.println(element));
			
		
		
	}
}
