
// Program to display the characters that appear maximum and minimum number of times in a string
package javaprograms;

import java.util.HashMap;
import java.util.Scanner;

public class MaxMinCharacter {

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim().toLowerCase();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
			} else {
				hashMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("Printing the characters that appears max number of times");
		getMax(hashMap);
		System.out.println("Printing the characters that appears min number of times");
		getMin(hashMap);

	}

	public static void getMax(HashMap<Character, Integer> hashMap) {
		Integer max = -1;
		for (Object obj : hashMap.keySet()) {
			if (hashMap.get(obj) >= max) {
				max = hashMap.get(obj);

				System.out.println(obj + " ");
			}
		}
	}

	public static void getMin(HashMap<Character, Integer> hashMap) {
		for (Object obj : hashMap.keySet()) {
			if (hashMap.get(obj) == 1) {
				System.out.println(obj + " ");
			}
		}
	}

}
