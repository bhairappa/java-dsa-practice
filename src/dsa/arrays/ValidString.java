package dsa.arrays;

import java.util.Stack;

public class ValidString {
	
	private static boolean isValid(String st) {
		Stack<Character> stk = new Stack<>();
		for(char cc : st.toCharArray()) {
			if(cc=='{')stk.push('}');
			else if(cc=='[')stk.push(']');
			else if(cc=='(')stk.push(')');
			else if(stk.isEmpty()||stk.pop()!=cc) {
				return false;
			}
		}
		return stk.isEmpty();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "[{()}]";
		System.out.println(isValid(st));

	}

}
