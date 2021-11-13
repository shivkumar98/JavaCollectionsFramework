package com.collectionsdemos;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersArray {

	public static void main(String[] args) {
		List<Integer> firstPrimeNumbers = new ArrayList<>();
		firstPrimeNumbers.add(2);
		firstPrimeNumbers.add(3);
		firstPrimeNumbers.add(5);
		firstPrimeNumbers.add(7);
		firstPrimeNumbers.add(11);
		
		// we can initialise another lsit using this list;
		
		List<Integer> firstTenPrimes = new ArrayList<Integer>(firstPrimeNumbers);
		
		List<Integer> nextFivePrimes = new ArrayList<Integer>();
		nextFivePrimes.add(13);
		nextFivePrimes.add(17);
		nextFivePrimes.add(19);
		nextFivePrimes.add(23);
		nextFivePrimes.add(29);
		
		// adding a list
		firstTenPrimes.addAll(nextFivePrimes);
		
		System.out.println(firstTenPrimes);
		

	}

}
