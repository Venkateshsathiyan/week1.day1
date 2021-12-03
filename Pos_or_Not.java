package week1.day2;

/*Pseudocode:
-----------
 1. Initialize a number, say, int number= 35;
 2. If a number is positive, print "The number is positive"
    If a number is negative, print "The number is negative"
    If it nether negative nor positive, print as "The number is neither positive nor negative"*/

public class Pos_or_Not {

	public static void main(String[] args) {
	 int num=0;
	 if (num>0)
	{
		 System.out.println("The Given number is positive");
	}
	 else if (num<0)
	{
		 System.out.println("The Given number is Negative");
	}
	 else {
		System.out.println("The number is neither positive nor negative");
	}
	}

}
