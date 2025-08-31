package src;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do want to enter?");
		
		int size = sc.nextInt();
		
		int[] num = new int[size];
		int[] copy = new int[size];
		
		System.out.println("Enter that " + size + " numbers");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("The duplicate array is");
		for(int j=0; j<size; j++) {
			copy[j] = num[j];
			if(copy[j] == num[j]) {
				System.out.println(copy[j]);
			}
		}
	}
}