package src;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = new int [5];
		
		System.out.println("Enter the numbers:");//store the values
		for(int i = 0; i<numbers.length; i++){
			numbers[i] = sc.nextInt();
		}
		
		for(int j = 0; j<numbers.length; j++){//print the values
			System.out.println(numbers[j]);
		}
	}
}
