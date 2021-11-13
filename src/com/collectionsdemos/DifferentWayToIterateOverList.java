package com.collectionsdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWayToIterateOverList {
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("C", "C+", "Hibernate", "spring");
		
		for (int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		
		//enhanced loop
		for (var i:courses) {
			System.out.println(i);
		}
		
		//loop wit iterator
		for (Iterator iterator = courses.iterator();iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
		//while loop
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
}
