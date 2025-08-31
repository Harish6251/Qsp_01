package src;

import java.util.Scanner;

public class MergeTwoIntoThird {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elemens do you want to enter?");
		
		int size = sc.nextInt();
		
		int [] num1 = new int[size];
		int [] num2 = new int[size];
		int [] num3 = new int[size * 2];
		
		System.out.println("Enter first array numbers");
		for(int i=0; i<size; i++) {
			num1[i] = sc.nextInt();
		}
		
		System.out.println("Enter second array numbers");
		for(int i=0; i<size; i++) {
			num2[i] = sc.nextInt();
		}
		
		System.out.print("The 1st array is [ ");
		for(int j=0; j<size; j++) {
			System.out.print(num1[j]);
			if(j!=size-1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
		
		System.out.print("The 2nd array is [ ");
		for(int k=0; k<size; k++) {
			System.out.print(num2[k]);
			if(k!=size-1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
		
		System.out.print("The merged array is [ ");
		for(int l=0; l<size; l++) {
			num3[l] = num1[l];
			System.out.print(num3[l]);
			if(l!=size-1) {
				System.out.print(", ");
			}
		}
		System.out.print(" ,");
		
		for(int l=0; l<size; l++) {
			num3[l] = num2[l];
			System.out.print(num3[l]);
			if(l!=size-1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
}
