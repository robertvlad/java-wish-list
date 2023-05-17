package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new HashMap<>();
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		
		System.out.println(Arrays.asList(str.split(" ")));
		
		for(String s : str.replaceAll("[!#-;.,]", "").split(" ")) {
			
			System.out.println(s);
			
			if (s.equals("")) continue;			
			
			if(myMap.containsKey(s)) {
				
				myMap.put(s, myMap.get(s) + 1);
				
			} else {
				myMap.put(s, 1);
			}
		}
		System.out.println(myMap);
		
		Iterator<String> itS = myMap.keySet().iterator();
		
		while(itS.hasNext()) {
			
			String s = itS.next();
			Integer v = myMap.get(s);
			
			System.out.println(s + " --> " + v);
		}
	}
}
