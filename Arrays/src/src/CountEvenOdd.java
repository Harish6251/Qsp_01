package src;

import java.util.Scanner;
public class CountEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int[] num = new int[5];
		int evenCount = 0;
		int oddCount = 0;
		
		System.out.println("Enter the numbers");
		for(int i=0;i<num.length;i++) {
			num[i] =sc.nextInt();
		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i] % 2 == 0) {
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("The even of the numbers is " + evenCount);
		System.out.println("The odd of the numbers is " + oddCount);
	}
}
