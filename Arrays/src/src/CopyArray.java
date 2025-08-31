package src;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("How many numbers do you want to enter?");
		
		int size = sc.nextInt();
		
		int [] num = new int [size];
		
		System.out.println("Enter that " + size + " numbers");
		for(int i=0; i<size; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("The orginal array is [");
		for(int j=0; j<size; j++) {
			System.out.print(num[j]);
			if(j!=size-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		int [] copy = new int [size];
		
		System.out.print("The copied array is [");
		for(int k=0; k<size;k++) {
			copy[k] = num[k];
			System.out.print(copy[k]);
			if(k!=size-1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
}