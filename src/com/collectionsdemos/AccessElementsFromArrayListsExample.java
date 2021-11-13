package com.collectionsdemos;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListsExample {

	public static void main(String[] args) {
		List<String> topProgrammeLangs = new ArrayList<>();
		
		//check if empty
		System.out.println(topProgrammeLangs.isEmpty());
		
		topProgrammeLangs.add("c++");
		topProgrammeLangs.add("java");
		topProgrammeLangs.add("python");
		topProgrammeLangs.add("c#");
		topProgrammeLangs.add("matlab");
		
		//size:
		System.out.println(topProgrammeLangs.size());
		
		//view element at index
		System.out.println(topProgrammeLangs.get(0));
		
		//set 
		System.out.println(topProgrammeLangs.set(0, ".Net"));
		System.out.println(topProgrammeLangs.get(0));
		
		// removing elements
		
		topProgrammeLangs.remove(topProgrammeLangs.get(4));
		
		System.out.println(topProgrammeLangs);
		
		List<String> langsIHate = new ArrayList<String>();
		langsIHate.add("python");
		
		topProgrammeLangs.clear( );
		
		topProgrammeLangs.removeAll(langsIHate);
		
		System.out.println(topProgrammeLangs);
		
		//comparing to arrays;
		String[] topLangs = new String[2];
		topLangs[1] = "C#";
		
		
		

	}

}
