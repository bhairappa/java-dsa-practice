package dsa.arrays;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "vishwa";
		int count=0;
		String st = s.toLowerCase();
		for(int i=0;i<st.length();i++) {
			char cc = st.charAt(i);
			
			if(cc=='a'||cc=='i'||cc=='e'||cc=='o'||cc=='u') {
				count++;
			}
		}System.out.println(count);
	}

}
