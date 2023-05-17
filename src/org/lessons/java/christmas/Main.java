package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();

		System.out.print("*********************************************************");
		System.out.print("- Welcome to your wish list! -");
		System.out.print("*********************************************************\n\n");

		Scanner scan = new Scanner(System.in);

		addingElements(scan, wishList);

		scan.close();

		sortWishList(wishList);
	}

	public static void addingElements(Scanner scan, ArrayList<String> wishList) {

		String choice = "";

		do {

			System.out.println("Enter a wish to add to the list: ");
			String wishToAdd = scan.nextLine();

			wishList.add(wishToAdd);

			System.out.print("*********************************************************");

			System.out.println("Elements of the wish list: " + wishList.size());

			System.out.println("\nDo you wanna add another one? [Y/N]");
			choice = scan.nextLine();

			System.out.print("*********************************************************");

		} while (choice.toLowerCase().equals("y"));

	}

	public static void sortWishList(ArrayList<String> wishList) {

		System.out.println("Sorted list in alphabetical order: ");

		Collections.sort(wishList);

		for (Iterator<String> iterator = wishList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
