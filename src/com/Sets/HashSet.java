package com.Sets;

import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		Set<String> programmingLangs = new java.util.HashSet<>();
		
		programmingLangs.add("C#");
		programmingLangs.add("python");
		programmingLangs.add("Java");
		programmingLangs.add("Javascript");
		
		System.out.println(programmingLangs);
		
		//adding suplicate value
		programmingLangs.add("C#");
		
		System.out.println(programmingLangs);
		
	}
}
