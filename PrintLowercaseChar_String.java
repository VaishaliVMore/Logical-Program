package String_Program;

public class PrintLowercaseChar_String {

	public static void main(String[] args) {
		
			String s="Vaishali More";
			for(int i=0;i<=s.length()-1;i++)
			{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			System.out.print(ch);
			}
			}
	
	
			//Output- aishaliore


	}


