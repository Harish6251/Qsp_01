package src;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestSmallest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do want to enter?");

		int size = sc.nextInt();
		
		int num [] = new int[size];
		
		System.out.println("Enter that " + size + " numbers");
		int i = 0;
		
		while(i<size) {
			num[i] = sc.nextInt();
			i++;
		}
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int secondLargest = num[num.length-2];
		int secondSmallest = num[1];
		
		System.out.println(secondSmallest);
		System.out.println(secondLargest);
	}
}