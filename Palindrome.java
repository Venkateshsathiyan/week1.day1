package week1.day2;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	public static void main(String[] args) 
	{
		String A = "madam";
		String rev = "";
		int str=A.length();
		for (int i = str-1 ; i >= 0; i--)
		{
			rev=rev + A.charAt(i);
			
		}
		//System.out.println(rev);
		if (A.equals(rev)) {
			System.out.println( rev +"is a palindrome");
		}
		else {
			System.out.println( rev +"is not a palindrome");
		}
		}

}
