package dsa.arrays;

public class FibbonacciUsingDP {
//	-----------------------------memoisation (Top-Down Approach)-----------------------
	
//	static int[] memo;
//	public static int fib(int n) {
//		
//	if(n<=1) {
//		return n;
//	}
//	if(memo==null) {
//	memo = new int[n+1];
//	for(int i=0;i<=n;i++) {
//		 memo[i]=-1;
//		}
//	}
//	if(memo[n]!=-1) {
//		return memo[n];
//	}
//	memo[n]=fib(n-1)+fib(n-2);
//	return memo[n];
//	}
//	----------------------- (Top-Down approach using Map recurssion)-------------------
//	static Map<Integer,Integer> memo = new HashMap<>();
//	public static int fib(int n) {
//		if(n<=1) {
//			return n;
//		}
//		if(memo.containsKey(n)) {
//			return memo.get(n);
//		}
//		int result = fib(n-1)+fib(n-2);
//		memo.put(n,result);
//		return result;	
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        int n=10;
//	     System.out.println(""+fib(n));
	     
//	     ----------------Bottom -Up Approach----------------------------
	     
	private static int fib(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n+1];
		if(n<=1) return n;
		 arr[0]=0;
		 arr[1]=1;
		 for(int i=2;i<=n;i++) {
			 arr[i]=arr[i-1]+arr[i-2];
		 }
		
		return arr[n];
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		         int n=10;
		 	     System.out.println(""+fib(n));
		
//		          -----------------------------Normal code which takes 2^n ------------
//		 	     
//		 	     public static int fib(int n) {
//		 	    	 if(n<=1) return n;
//		 	    	 return f(n-1)+f(n-2);
//		 	     }

	}

}
