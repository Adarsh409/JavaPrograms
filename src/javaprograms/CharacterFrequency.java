
// Program to find the occurrence of characters in a string
package javaprograms;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

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
		for(Object obj:hashMap.keySet()) {
			System.out.println(obj+"---->"+hashMap.get(obj));
		}

	}

}
