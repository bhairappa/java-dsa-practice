package dsa.arrays;

public class LongestPalindromeInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start =0,end=0;
		String str = "papad";
		for(int i=0;i<str.length();i++) {
			
			int len1 = longestPalidrome(str,i,i);
			int len2 = longestPalidrome(str,i,i+1);
			
			int maxLength = Math.max(len1, len2);
			
			if(maxLength>end-start+1) {
				start = i-(maxLength-1)/2;
				end = i+maxLength/2;
			}
			
		}System.out.println(str.substring(start,end+1));

	}

	private static int longestPalidrome(String str, int left, int right) {
		// TODO Auto-generated method stub
		while(left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}


}
