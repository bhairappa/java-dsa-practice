package dsa.arrays;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc = "gadaga";
		String assume = new StringBuilder(sc).reverse().toString();
		System.out.println(assume.equals(sc)?" String are palidrome":"String are not palidrome");
//		System.out.println("Hello riStringPalindromeCheck");

	}

}
