package String_Program;

public class PrintUpperCaseChar_String {

	public static void main(String[] args) {
		
			String s="VaishaLi More";
			for(int i=0;i<=s.length()-1;i++)
			{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			System.out.print(ch);
			}
			
			
			//Output-VLM



	}

}
