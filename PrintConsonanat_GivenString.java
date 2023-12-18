package String_Program;

public class PrintConsonanat_GivenString {

	//-----------------------method1------------------------------
	
//	public static void main(String[] args) {
//		String s="vaishali";
//		for(int i=0;i<=s.length()-1;i++)
//		{
//		char ch=s.charAt(i);
//		if(ch!='a' && ch!='e' && ch!='i')
//		System.out.println(ch);
//		}
//		}
	//output-Vshl
	
		//--------------------------------------------method2-------------------------------------
	
		
		public static void main(String[] args) {
		String inputString = "Vaishali";
		String consonants = inputString.replaceAll("[aeiou]", "");
		// Print the consonants
		System.out.println("Consonants in the string: " + consonants);
		}
		} 
//output- Vshl
