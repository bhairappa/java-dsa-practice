package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the size of first array");
			    int sizeOfFirstArray = sc.nextInt();
			    int[] arr =new int[sizeOfFirstArray];
			    System.out.println(" enter the elements of first array");
			    for(int i=0;i<sizeOfFirstArray;i++) {
			    	 arr[i] =sc.nextInt();
			    	    	}
			    System.out.println("enter the size of second array");
			    int sizeOfSecondArray = sc.nextInt();
			    int[] arr2 =new int[sizeOfSecondArray];
			    System.out.println(" enter the elements of seecond array");
			    for(int i=0;i<sizeOfSecondArray;i++) {
			    	 arr2[i] =sc.nextInt();
			    	    	}
			    int[] newsize = new int[sizeOfFirstArray+sizeOfSecondArray];
			     for(int  i=0;i<sizeOfFirstArray;i++) {
			    	 newsize[i]=arr[i];
			     }
			     for(int i=0;i<sizeOfSecondArray;i++) {
			    	 newsize[sizeOfFirstArray+i]=arr2[i];
			     }
			     System.out.println("after merging : " +Arrays.toString(newsize));

	}
}
