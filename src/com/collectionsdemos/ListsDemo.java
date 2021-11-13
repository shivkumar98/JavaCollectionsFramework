package com.collectionsdemos;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
	public static void main(String[] args) {                                                                                                                                                                      
		// List is an interface which extends collection - its is an ordered collection
		//array list is dynamically sized
		// has an initial capacity
		
		List<String> list = new ArrayList<String>();
		list.add("duplicated value");
		
		//lists allow duplicates
		list.add("duplicated value");
		
		//list allows nulls
		list.add(null);
		
		//lists allows you to insert at any index
		
		list.add(0, "my string~");
		
		//list lets you remove values based on index and value;
		
		list.remove(0);
		
		
		list.forEach((element) -> {
			System.out.println(element);
		});
		
		list.remove("duplicated value");
		
		System.out.println(list);
		
		List<String> names = new ArrayList<String>();
		names.add("shiv");
		names.add("kumar");
		
		list.addAll(names);
		
		
		System.out.println(list);
		
		list.removeAll(names);
		
		System.out.println(list);
		
		
	}

}
