package String_Program;

public class PrintDuplicateChar_String {

	public static void main(String[] args)
	{
		String s="Vaishali ";
		char[] ch=s.toCharArray();
		System.out.println("orignal string is "+s);
		System.out.println("dublicate string is: ");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]+" ");	
                  }
              }
         }
     }
	}
//output-dublicate string is:a i 

