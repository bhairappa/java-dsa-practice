package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "gadag";
		String s2 = "aadgg";
		Map<Character,Integer>mp =new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			char cc = s1.charAt(i);
			 mp.put(cc, mp.getOrDefault(cc, 0)+1);
		}
		System.out.println(mp);
		Map<Character,Integer>mp1 =new HashMap<>();
		for(int i=0;i<s2.length();i++) {
			char cc = s2.charAt(i);
			 mp1.put(cc, mp1.getOrDefault(cc, 0)+1);
		}
		System.out.println(mp.equals(mp1)?"Strings are anagram ":"Strings are not anagram");
		
	}

}
