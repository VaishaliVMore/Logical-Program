package String_Program;

public class ReverseOrder_Sentence {

	public static void main(String[] args) {
		
		String input = "Vaishali More"; // Input string
		String[] words = input.split(" ");// Split the input string into words
		System.out.println(words[0]);
		System.out.println(words[1]);

		String output = words[1] + " " + words[0];// Rearrange the words
		System.out.println("Output: " + output); // Print the output
		 }
		} 
	//output=More vaishali
	
//		-------------------------------------------Method2-------------------------------------
	
//        public static void main(String[] args) {
//		String input = "Vaishali More";
//		String[] words = input.split(" ");// Split the input string into words
//        String reversed =" ";// Reverse the order of words without using StringBuilder
//
//		for (int i = words.length - 1; i >= 0; i--)
//		{
//		    reversed=reversed+ words[i];
//		      if (i > 0) 
//		      {
//		        reversed=reversed + " "; // Add space between words
//		        }
//		    }
//		System.out.println("Reversed: " + reversed); // Print the reversed string
//		}
//		}
		//output-Reversed:  More Vaishali

		
	//---------------------------------Method3--------------------------------------------------
//		public static void main(String args[])
//		{
//		String str=" I am Vaishali";
//		String s[] = str.split(" "); 
//		String ans = " "; 
//		for (int i = s.length - 1; i >= 0; i--) 
//		{ 
//		   ans=ans+ s[i] + " "; 
//		} 
//		System.out.println("Reversed String: " + ans); 
//		}
//		}
		//output -Reversed String:  Vaishali am I 

//-----------------------------------method4-----------------------------------------------------
	
//public static void main(String[] args) 
//{
//String str = "Hello I am Japneet";
//printReverseSentence(str);
//}
//private static void printReverseSentence(String str)
//  {
//     String [] strSplit = str.split("\\s");
//     for(int i=strSplit.length-1; i>=0; i--)
//  {
//    System.out.print(strSplit[i]+" ");
//   }
//}
//}
////Output- Japneet am I Hello 


	


