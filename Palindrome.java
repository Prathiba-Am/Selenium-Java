package week1.assignments.optional;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "101";
				//Declare another String rev
				String rev = "";
				
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */
				char[] array=text.toCharArray();
				for(int i=array.length-1;i>=0;i--)
				{
					rev=rev+array[i];
					//System.out.println(rev);

				}
		if(text.equals(rev)==true)
		{
			System.out.println(text+" is a palindrome");
		}else{
			System.out.println(text+" is not a palindrome");
		}
	}

}
