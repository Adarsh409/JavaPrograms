
// a3b2c3, Output: aaabbccc.
package javaprograms;

import java.util.Scanner;

public class ExpandString {

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 1) {
				int count = Character.getNumericValue(str.charAt(i));
				char x = str.charAt(i - 1);
				while (count != 0) {
					str2 = str2 + x;
					count --;
				}
			}
		}

		System.out.println("Output: " + str2);

	}

}
