package String_Program;

public class PrintDigitFirst_String {

	public static void main(String[] args) 
	{
		
			String s="ra09 more ";
			String a="";
			String d="";
			for(int i=0;i<=s.length()-1;i++)
			{
			   char c=s.charAt(i);
			   if(Character.isDigit(c))
			   d=d+c;
			   else
			   a=a+c;
			}
			  String ans=d+a;
			  System.out.println("output of first digit is  : "+ ans);
			

	         }
	}

  //output of first digit is  : 09ra more 
