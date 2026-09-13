package dsa.arrays;

public class SwapTwoNumbersWIthXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int m = 8;
		n= n^m;
		m= n^m;
		n= n^m;
		System.out.println(n+" "+m);
	}

}
