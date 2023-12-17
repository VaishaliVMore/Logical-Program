package String_Program;

public class CountLowersCaseChar_String {

	public static void main(String[] args)
	{
		String s="Vaishali More";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
		char ch=s.charAt(i);
		if(Character.isLowerCase(ch))
		count++;
		}
		System.out.print("Total count Lowercase char is : " +count);
		}

	}

  //output-Total count Lowercase char is : 10
