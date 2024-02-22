// Program to find longest and shortest word in a string
package javaprograms;

import java.util.Scanner;

public class LongShortWord {

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		System.out.println("Longest word in the String is: "+findLongestWord(str.split("\\s")));
		System.out.println("Shortest word in the String is: "+findShortestWord(str.split("\\s")));
	}
	public static String findShortestWord(String[] strArray) {
		String shortest=strArray[0];;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i].length()<shortest.length()) {
				shortest=strArray[i];
				
			}
			
		}
		return shortest;
	}
	
	public static String findLongestWord(String[] strArray) {
		String longest=strArray[0];
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i].length()>longest.length()) {
				longest=strArray[i];
				
			}
	}
		return longest;
	}
}
