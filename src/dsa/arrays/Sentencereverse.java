package dsa.arrays;

public class Sentencereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "we love java and python";
		StringBuilder sb = new StringBuilder();
		String[] ss = st.split(" ");
		for(int i=ss.length-1;i>=0;i--) {
			sb.append(ss[i]+" ");
		}
		String original  = sb.toString().trim();
		System.out.println(original);
	}
}
