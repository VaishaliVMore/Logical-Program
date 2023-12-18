package String_Program;

public class CountConsonant_GivenString {

	public static void main(String[] args) {
		
			String str = "Vaishali";
			int Count = 0; 
			for(int i = 0; i < str.length(); i++) { 
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'&& str.charAt(i) != 'o' && str.charAt(i) 
			!= 'u')
			{ 
			Count++;
			//System.out.print(str.charAt(i));
			} 
			}
			System.out.println(Count);
			}
			}
			
               
 //output- 4

