package dsa.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesremoveInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
       System.out.println(" enter the size of array");
	  int sizeOfArray = sc.nextInt();
	  int []array = new int[sizeOfArray];
	  System.out.println("enter the elemenets of array");
	   for(int i=0;i<sizeOfArray;i++) {
		   array[i]=sc.nextInt();
	   }
	   Set<Integer> duplicates = new HashSet<>();
	   for(int i=0;i<sizeOfArray;i++) {
		   duplicates.add(array[i]);
	   }
	   System.out.println(""+duplicates);
	// Convert the Set to an array if needed
//	   Integer[] uniqueArray = duplicates.toArray(new Integer[0]);
//
//	   // Print the array of unique elements
//	   System.out.println("Array with duplicates removed:");
//	   for (Integer num : uniqueArray) {
//	       System.out.print(num + " ");
//	   }

	}

}
