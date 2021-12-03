package week1.day2;

import java.util.Arrays;

/* Pseudo Code:

 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/
public class ReverseEvenWords {

	
			public static void main(String[] args) {

				String str = "I am a software tester";
				String[] str2 = str.split(" ");
				String str3 = "";
				String k = "";
				for (int i = 0; i < str2.length; i++)
				{
					if (i%2 ==0)
					{
						System.out.println(""+ str2[i] + "");
					}
					else 
					{
						str3 = str2[i];
						for (int j = str3.length()-1; j>=0; j--)
						{
							k = "" + str3.charAt(j);
							System.out.println(k);

						}
			      str3="";
					}
				}

			}
}
