package String_Program;

public class CountUpperCaseChar_String {

	public static void main(String[] args) 
	{
		String s="Vaishali More";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		count++;
		}
		System.out.print("UpperCase Char count is  : " +count);
		}
	}
  //output-UpperCase Char count is  : 2

