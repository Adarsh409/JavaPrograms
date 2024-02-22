package javaprograms;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next().trim();
		String reversedString = "";
		for(int i=inputString.length()-1;i>=0;i--) {
			reversedString = reversedString+inputString.charAt(i);
		}
		System.out.println("Reversed String: "+reversedString);
		
	}

}
