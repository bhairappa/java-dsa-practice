
package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6,5,7,4,8,9};
		int n = 9;
		Map<Integer,Integer>map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int target = n-arr[i];
			if(map.containsKey(target)) {
				System.out.println("indices are: "+i+" and "+map.get(target));
				return;
			}map.put(arr[i], i);
		}	System.out.println("No indices found");	
	}
}
