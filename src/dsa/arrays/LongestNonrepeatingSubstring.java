package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestNonrepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcbhjhaghkl";
		int left=0,maxIndex=0,startIndex=0;
		Map<Character,Integer>mp= new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char cc = str.charAt(i);
			if(mp.containsKey(cc)&&mp.get(cc)>left) {
				left = mp.get(cc)+1;
			}mp.put(cc, i);
			if(i-left+1>maxIndex) {
				maxIndex=i-left+1;
				startIndex=left;
			}
		}
		System.out.println(str.substring(startIndex,startIndex+maxIndex));

	}

}
