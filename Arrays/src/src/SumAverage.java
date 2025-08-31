package src;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do want to enter?");
		
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter that " + size + " numbers");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		int avg = 0;
		
		for(int j=0; j<size; j++) {
			sum = sum + num[j];
			avg = avg + num[j];
		}
		avg = avg / size;
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The averge of the numbers is " + avg);
	}
}