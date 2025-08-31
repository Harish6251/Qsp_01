package src;

import java.util.Scanner;
import java.util.Arrays;

public class SortAscDesc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to print?");
		
		int size = sc.nextInt();
		
		int [] num = new int[size];
		
		System.out.println("Eneter that " + size + " numbers");
		for(int i=0; i<size; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println("Ascending Order  " + Arrays.toString(num));

		System.out.print("Descending Order [");
		for(int j=size-1; j>=0; j--) {
			System.out.print(num[j]);
			if(j!=0) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}