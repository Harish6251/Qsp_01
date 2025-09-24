
package src;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter?");
        
        int size = sc.nextInt();
        
        int[] a = new int[size];
        boolean[] b = new boolean[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < a.length; i++) {
            if (!b[i]) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        b[j] = true;
                    }
                }
                System.out.println(a[i] + " is occured" + count + " times");
                }
            }
        }

        sc.close();
    }
}
