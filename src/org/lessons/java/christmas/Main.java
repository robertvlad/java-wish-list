package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> wishList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int i = -1;
		
		while (i != 1) {
			
			System.out.println("Premere 0 per inserire un nuovo desiderio \nPremere 1 per stampare la lista");
			i = Integer.parseInt(sc.nextLine());
			
			if (i < 0 || i > 1) {
				
				System.out.println("Errore, riprovare!");
				continue;
			}
			
			if (i == 0) {
				
				System.out.println("Qual'è il tuo desiderio?");
				String desiderio = sc.nextLine();
				
				wishList.add(desiderio);
				
				System.out.println("La lunghezza della lista è " + wishList.size());
			}
		}
		
		System.out.println("Lista dei desideri -> " + wishList);
		
		sc.close();
	}
}
