package com.collectionsdemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("apple");
		Collection<String> fruitsNotEaten = new ArrayList<String>();
		fruitsNotEaten.add("duruan");
		fruitsNotEaten.add("guava");
		fruits.addAll(fruitsNotEaten);
		
		fruits.forEach((element) -> {
			System.out.println(element);
		});
		
		System.out.println(fruits);
	}
	
	
}
