// Program to find duplicate words in a string
package javaprograms;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		String[] strArray = str.split("\\s");
		List<String> lst = new ArrayList<String>();
		
		for (int i = 0; i < strArray.length; i++) {
			String str2 = strArray[i];
			for (int j = i + 1; j < strArray.length; j++) {
				if (str2.equalsIgnoreCase(strArray[j])) {
					lst.add(str2);
				}
			}
		}
		System.out.print("Duplicates found for words: ");
		for(int i=0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}
	}
	

}
