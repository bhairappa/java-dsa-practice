package dsa.arrays;

public class MaxSumSubArry {

	public static int main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				int [] array = {2,3,-1,4,-6,4,1,-2};
		        int maxEndingHere = array[0];
		        int maxsofor= array[0];

			    for(int i=0;i<array.length;i++) {
		            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
		            
		            // Update maxSoFar to keep track of the global maximum
		            maxsofor = Math.max(maxsofor, maxEndingHere);
		        }
		        return maxsofor;
	}

}
