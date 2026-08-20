package dsa.arrays;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "gadapd";
		String len= "";
		for(int i=0;i<st.length();i++){
			for(int j=i;j<st.length();j++) {
				
				String ss = st.substring(i, j+1);
				if(isValid(ss)&&ss.length()>len.length()) {
					len=ss;
				}
				
			}
		}
		System.out.println(len);
		}
	private static boolean isValid(String st) {
		int start=0;
		int end = st.length()-1;
		
		while(start<end) {
			if(st.charAt(start)!=st.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
		}		
		return true;
	}

}
