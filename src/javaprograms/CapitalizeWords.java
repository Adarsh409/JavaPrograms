// Program to capitalize first letter of each word in a string
package javaprograms;

import java.util.Scanner;

public class CapitalizeWords {

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		String[] strArray = str.split("\\s");
		String str3 = "";
		for (int i = 0; i < strArray.length; i++) {
			String str2 = strArray[i];
			for (int j = 0; j < str2.length(); j++) {
				if (j == 0) {
					str3 = str3 + Character.toUpperCase(str2.charAt(j));
				} else {
					str3 = str3 + str2.charAt(j);
				}
			}
			str3 = str3 + " ";
		}

		System.out.println("String after capitalizing words: " + str3);

	}

}
