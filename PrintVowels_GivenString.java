package String_Program;

public class PrintVowels_GivenString {

	public static void main(String[] args) {
		//-------------------method1--------------------------------------------------------------
		
		
//		String inputString = "Vaishali";
//		String vowels = inputString.replaceAll("[^aeiou]", "");
//		System.out.println("Vowels in the string: " + vowels);
//		}
//      }
		
		//Ouput-Vowels in the string: aiai
		
		//----------------------------Method2------------------------------------------------------------------------
		
		String s="vaishali";
		for(int i=0;i<=s.length()-1;i++)
		{
		char ch=s.charAt(i);
		if(ch=='a'|| ch=='e' || ch=='i')
		System.out.print(ch);
		}

	}

}
         //output-aiai

