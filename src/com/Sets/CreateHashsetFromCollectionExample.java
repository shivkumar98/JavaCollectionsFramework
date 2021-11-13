package com.Sets;

import java.util.HashSet;
import java.util.Set;

public class CreateHashsetFromCollectionExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);
		set.add(10);
		set.add(12);
		
		//initialisng Hashset using another Hashset
		Set<Integer> EvenIntegers = new HashSet<Integer>(set);
		
		Set<Integer> moreIntegers = new HashSet<Integer>();
		
		moreIntegers.add(2222);
		moreIntegers.add(3333332);
		
		//adding a collection
		EvenIntegers.addAll(moreIntegers);
		System.out.println(EvenIntegers);
		
	}

}
