
// Program to divide a string into n equal parts
package javaprograms;

import java.util.Scanner;

public class DivideString {

	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("How many equal parts do you need?");
		int n = sc.nextInt();
		if ((str.length() % n) != 0) {
			System.out.println("Given string can't be divided to " + n + " equal parts");
		} else {
			divideString(str,n);
		}

	}

	public static void divideString(String str, int n) {
		int count = n;
		int start = 0;
		int end = (str.length() / n);
		while (count > 0) {
			String str2 = str.substring(start, end);
			System.out.print(str2+" ");
			start = end; 
			end = start+(str.length()/n); 
			
			count--;
		}
	}

}
