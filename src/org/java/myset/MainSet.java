package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	
	public static void main(String[] args) {
		
		Set<Integer> randNumbers = new HashSet<>();
		Random rand = new Random();
		
		while(randNumbers.size() < 5) {
			
			int value = rand.nextInt(2, 13);
			randNumbers.add(value);
		}

		System.out.println(randNumbers);
	}	
}
