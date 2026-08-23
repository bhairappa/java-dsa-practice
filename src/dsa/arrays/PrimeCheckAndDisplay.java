package dsa.arrays;

public class PrimeCheckAndDisplay {

	private static boolean isPrime(int n) {
		
		if(n%2==0)return false;
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) return false;
		}	
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 69;
		System.out.println(isPrime(num)?"number is prime ":"number is not prime");
	}

}
