package String_Program;

public class RemoveSpecialChar_String {

	
//		String s="Velocity@"
//		Output v=Velocity
		
	//----------------------method1----------------------
	
//		public static void main(String[] args) {
//		String s="Velocity@";
//		String s1 = s.replace("@", "");
//		System.out.println(s1);
//		}
//		}
		
		//output-Velocity

	//-------------------------method2---------------------
	public static void main(String[] args)
	{

		String s2="V!el&ocit@y";
		String S3 = s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S3);

	}
}
//output-Velocity
