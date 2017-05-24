package session6;
import java.util.Scanner;  //Import scanner class
		//create class

public class demoarray {

	public static void main(String[] args) {
		//define array
		int[] a;
		int temp, no;
		//declaring size
		a = new int[8];

		Scanner ob = new Scanner(System.in);
		//enter the number
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = ob.nextInt();
		}
		//printing number entered 
		System.out.println("number entered by you ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		//SWAP TO SORT AN ARRAY

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		System.out.print(" sorted ");
		//printing sorted array
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		//enter the number you want to search
		System.out.println("\n enter the element you want to find in array  ");
		Scanner obj2 = new Scanner(System.in);
		no = obj2.nextInt();
		//initializing begining and last index
		int beg = 0;
		int last = a.length - 1;
		//a count for counter
		int count = 0;
		//condition till loop will last
		while (beg <= last) {
		// mid to store middle element for binary search
			int mid = (beg + last) / 2;
		//condition to print the specified number
			if (no == a[mid]) {
			    int pos =mid+1;
				System.out.println("number present at position  " + pos);

				count++;

				break;
		//logic in binary search		
			}
			if (no > a[mid]) {
				beg = mid + 1;
				;
			}
			if (no < a[mid]) {
				last = mid - 1;

			}

		}
		//condition performed to check whether a number is in array or not
		if (count == 0)
			System.out.println("Number given is not present in array  ");
		else
		
			System.out.println("number entered by you is present  ");
	}
}

-------------------------------
Sample Output:
sh-4.3$ javac demoarray.java                                                    
sh-4.3$ java demoarray                                                          
enter the number                                                                
9                                                                               
8                                                                               
6                                                                               
7                                                                               
0                                                                               
2                                                                               
4                                                                               
1                                                                               
number entered by you                                                           
9 8 6 7 0 2 4 1 sorted  0 1 2 4 6 7 8 9                                        
 enter the element you want to find in array                                    
6                                                                               
number present at position  5                                                   
number entered by you is present 
