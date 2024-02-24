// Program to check if strings are Palindrome
package javaprograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str3 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str3 = str3 + str1.charAt(i);
		}
		
		if(str1.equalsIgnoreCase(str3)) {
			System.out.println("Strings are palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
