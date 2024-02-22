// Program to find duplicate characters in a string
package javaprograms;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine().trim().toLowerCase();
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for(int i =0;i<str.length();i++) {
			if(hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
			}
			else {
				hashMap.put(str.charAt(i), 1);
			}
		}
		System.out.print("Duplicates found are: ");
		for(Object obj:hashMap.keySet()) {
			if(hashMap.get(obj)>1) {
				System.out.print(obj+" ");
			}
		}

	}

}
