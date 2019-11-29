package week1.assignments.optional;
import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "wots";
				int a=0;
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
		char[] array1=text1.toCharArray();
		char[] array2=text2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		for(int i=0;i<text1.length();i++) {
			if(array1.length==array2.length)
			{	if(array1[i]==array2[i])

				{
					a=1;
				}
				else
				{
					a=2;
				}
		}
		else{
				a=3;
			}
		}
		if(a==1)
		{
			System.out.println(text1+" is an anagram of "+text2);
		}else if(a==2)
		{
			System.out.println(text1+" is not an anagram of "+text2);
		}else if (a==3)
		{
			System.out.println("Both the words are not equal in length");
		}


	}

}
