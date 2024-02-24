// Program to reverse a string
package javaprograms;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine().trim();
		String reversedString = "";
		for(int i=inputString.length()-1;i>=0;i--) {
			reversedString = reversedString+inputString.charAt(i);
		}
		System.out.println("Reversed String: "+reversedString);
		
	}
	//M a l a y a l a m t  10/5   0 2  2 4 4
	

}
