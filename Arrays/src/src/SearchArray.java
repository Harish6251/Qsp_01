package src;

import java.util.Scanner;

public class SearchArray {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("How many elements do want to enter?");
	
	int size = sc.nextInt();
	
	int[] num = new int[size];
	
	System.out.println("Enter that " + size + " numbers");
	int i = 0;
	while(i<size) {
		num[i] = sc.nextInt();
		i++;
	}
	
	System.out.println("Search a number");
	int s = sc.nextInt();
	int search = s-1;
	
	System.out.println("The number you searched is " + num[search] );
	}
}