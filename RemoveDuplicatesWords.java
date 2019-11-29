package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "I java know how to java remove duplicate java words";
		// Initialise an integer variable as count
		int count = 0;
		String newText="";
			/*
			 * Pseudo code
			 * a) Split the String into array and iterate over it
			 * b) Initialise another loop to check whether the word is there in the array
			 * c) if it is available then increase and count by 1.
			 * d) if the count > 1 then replace the word as ""
			 * e) print the each word
			 */
		String[] array=text.split(" ");
			for(int i=0;i<array.length;i++)
			{
				count=0;
				for(int j=0;j<array.length;j++)
				{
					if(array[i].equals(array[j]))
					{
						count++;
					}
					else {}
				}
				if(count>1)
				{
					newText = text.replace(array[i],"");
				}
			}

				System.out.println(newText);
	}

}
