// Program to calculate the sum of array elements
package javaprograms;

public class ArrayElementsSum {

	public static void main(String[] args) {
		int[] numArray = {4,5,3,1,3};
		int sum=0;
		for(int i=0;i<numArray.length;i++) {
			sum = sum + numArray[i];
		}
		System.out.println("Sum of array elements: "+sum);

	}

}
