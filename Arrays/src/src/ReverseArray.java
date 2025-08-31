package src;

import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do want to enter?");
		
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter that " + size + " numbers");
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=size-1; i>=0; i--) {
			System.out.print(num[i]+ " ");
		}
	}
}
