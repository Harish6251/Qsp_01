package src;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do want to enter?");
		
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter that " + size + " numbers");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		int min = num[0];
		
		for(int j=0; j<num.length; j++) {
			if(num[j] < min) {
				min = num[j];
			}
		}
		System.out.println("The smallest numbers is " + min);
	}
}