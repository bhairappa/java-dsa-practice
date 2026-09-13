//package stringpackage;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class CharacterCount {
//	private static void charactercount(String input) {
//		// TODO Auto-generated method stub
//		
//		int maxfreequency =0;
//		int chardefault = '\0';
//		Map<Character,Integer> charcount = new HashMap<>();
//		for(int i=0;i<input.length();i++) {
//			char c = input.charAt(i);			
//			charcount.put(c, charcount.getOrDefault(c, 0)+1);
//		}
//		for(Character key :charcount.keySet()) {
//			int cuurentFreequency = charcount.get(key);
//			if(cuurentFreequency>maxfreequency) {
//				maxfreequency=cuurentFreequency;
//				chardefault=key;
//			}
//		}			System.out.println(" character "+chardefault+ " is appeared "+maxfreequency);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a string ");
//		String input = sc.nextLine();
//		charactercount(input);
//	}
//
//}
		package dsa.arrays;

		import java.util.HashMap;
		import java.util.Map;
		import java.util.Scanner;

		public class CharacterCount {
		    private static void charactercount(String input) {
		        // Variable initialization
		        int maxFrequency = 0;
		        char charDefault = '\0'; // Default character
		        Map<Character, Integer> charCount = new HashMap<>();		        
		        // Count character frequencies
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);            
		            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		        }	        
		        // Find the character with maximum frequency
		        for (Character key : charCount.keySet()) {
		            int currentFrequency = charCount.get(key);
		            if (currentFrequency > maxFrequency) {
		                maxFrequency = currentFrequency;
		                charDefault = key;
		            }
		        }		        
		        // Output the result
		        System.out.println("Character '" + charDefault + "' appeared " + maxFrequency + " times.");
		    }
		    public static void main(String[] args) {
		        // User input
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a string: ");
		        String input = sc.nextLine();
		        charactercount(input);
		    }
		}

		
	
