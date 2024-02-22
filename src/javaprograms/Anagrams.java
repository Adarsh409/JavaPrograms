package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.nextLine().trim();
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine().trim();
		if(str1.length() != str2.length()) {
			System.out.println("Strings are not anagrams");
		}
		else {
			if(areAnagrams(str1.toCharArray(),str2.toCharArray())) {
				System.out.println("Strings are anagrams");
			}
			else {
				System.out.println("Strings are not anagrams");
			}
		}
		
	}
	
	public static boolean areAnagrams(char[] str1Array,char[] str2Array) {
		boolean flag = false ;
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		for(int i=0;i<str1Array.length;i++) {
			if(str1Array[i] != str2Array[i]) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		}
		return flag;
	}
	
	
}
