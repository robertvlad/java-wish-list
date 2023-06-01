package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Set<Integer> numeri = new HashSet<>();
		
		for (int i = 0; i < 5; i++) {
			
			int nr = rnd.nextInt(2, 13);
			System.out.println(nr);
			
			numeri.add(nr);
		}
		
		System.out.println("La lista dei numeri è: " + numeri);
	}
}
