package com.LinkedLists;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class CreateLinkedLists {
	
	/*
	 * methods add(), add(index, element)
	 * addFirst() come from deque
	 * addLast()
	 * 
	 */
	
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("banana");
		fruits.add("strawberry");
		fruits.add("mango");
		
		System.out.println(fruits);
		
		fruits.add(2, "guava");
		
		fruits.addFirst("cherry");
		fruits.addLast("chicken");
		
		System.out.println(fruits);
		
		fruits.getFirst();
		fruits.getLast();
		
		System.out.println(fruits.indexOf("guava"));
		
		//Iterator
		Iterator iterator = fruits.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		fruits.forEach((element) -> {
			System.out.println(element);
		});
		

		
		//Deque
		Deque<Integer> integers = new LinkedList<Integer>();
		integers.add(2);
		integers.add(2);
		
		//cannot add integer at specific location
		
	}

}
