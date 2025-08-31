package src;

import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many numbers do you want to enter?");
		
		int size = sc.nextInt();
		int[] num = new int[size];
		
		System.out.println("Entet that numbers:"); //Store the values
		for(int i=0; i<size;i++)
		{
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		
		for(int j=1; j<num.length;j++)
		{
			if(num[j] > max)
			{
				max = num[j];
			}
		}
		System.out.println("The largest numbers is " + max);
	}
}