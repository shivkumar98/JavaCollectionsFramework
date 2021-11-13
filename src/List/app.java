package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class app {
	
	
	class solution {
		
	}
	
	public static void main(String[] args) {
			
		System.out.println("is input palindrome: "+isPalindrome(222));

	}

	public static boolean isPalindrome(int x) {
		String text = Integer.toString(x);
		String[] text1 = text.split("");
		boolean difference = false;
		
		for ( var i =0; i<text1.length/2 +1; i++) {
			
			if ( !text1[i].equals(text1[text1.length-i-1])) {
				
				difference = true;
				break;
			}
		}
		
		return !difference;
		
		
	}

}

