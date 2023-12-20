package String_Program;

public class RemoveSpace_String {

	
		
		//Input- vaishali More
		//-----------------------------Method1--------------By using replacemethod-------------------
		public static void main(String[] args) {
		 String s="vaishali More"; //input
		 String output=s.replace(" ","");
		 System.out.println(output);
		}
		}
//output-vaishaliMore

		//---------------------------------------------------------------------------------------

//      public static void main(String[] args)
//       {
//		String s2="vaishali More";
//		String S3 = s2.replaceAll(" ", "");
//		System.out.println(S3);
//		}

//output-vaishaliMore

//		---------------------------------Method2----------withoutreplacemethod------------------------

//     public static void main(String[] args)
//     {
//		String input = "Vaishali More";
//		String output = "";
//		for (int i = 0; i < input.length(); i++)
//		{
//		char ch = input.charAt(i);
//		if (ch != ' ') 
//        {
//		     output=output+ch;
//		   }
//		   }
//		     System.out.println("Output: " + output);
//		}

//		Output- vaishaliMore
//	}


