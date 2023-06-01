package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		
		String strLow = str.toLowerCase();		
		String strClean = str.replaceAll("[^a-zA-Z ]", "");		
		String[] strA = strClean.split(" ");
		
		Map<String, Integer> myMap = new HashMap<>();
		
		for (String s : strA) {
			
			if (s.isBlank()) {
				
				continue;
			} else if(myMap.containsKey(s)) {
				
				myMap.put(s, myMap.get(s) + 1);
			}
			else {
				myMap.put(s, 1);
			}
		}
		
		System.out.println(myMap);		
	}
}
