package String_Program;

public class Reverse_Sentence {

	public static void main(String[] args) {
		 
		{
		String input = "vaishali more"; // Input string
		String[] words = input.split(" ");// Split the input string into words
		String reversed = "";
		for (int i = words.length - 1; i >= 0; i--) {
		String word = words[i];
		String reversedWord = "";
		for (int j = word.length() - 1; j >= 0; j--) {
		reversedWord += word.charAt(j);
		}
		reversed=reversed+ reversedWord;
		if (i > 0) {
		reversed=reversed+ " "; // Add space between words
		}
		}
		System.out.println("Reversed: " + reversed); // Print the reversed string
		}
		} 
}
	//	output-Reversed: erom ilahsiav
//		
		
		//--------------------method2--------------------------------------------------------------------
	
//		public static void main(String[] args) 
//		{
//			String Input = "My Name Vaishali"; 
//			for(int i=Input.length()-1;i>=0;i-- )
//			{
//			     System.out.print(Input.charAt(i)); 
//		    }
//		  }
//
//          }
////output=ilahsiaV emaN yM
