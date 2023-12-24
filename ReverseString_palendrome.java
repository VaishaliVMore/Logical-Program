package String_Program;

public class ReverseString_palendrome {

	//----------------------------method1----------------------------------
	
		public static void main(String[] args) {
			String org="vaishali";
			String rev="";
			for(int i=org.length()-1;i>=0;i--)
			{
			rev=rev+org.charAt(i);
			}
			System.out.println("print reverse sting is :"+rev);
			if(org.equals(rev))
			{
			System.out.println("Given String is palindorme");
			}
			else
			{
			System.out.println("Given String is not palindorme"); 
			}
		}
}
			
			//output=print reverse sting is :ilahsiav
			//Given String is not palindorme
			
		//	------------------method2------------------------------------------------------
			
//	    public static void main(String[] args) {
//			String original="vaishali";
//			String reverse="";
//			int length=original.length();
//			char a[]=original.toCharArray();
//			for(int i=length-1;i>=0;i--)
//			{
//			reverse=reverse+a[i];
//			}
//			System.out.println("print reverse String :  " +reverse);
//			}
//			
//	    //Output-print reverse String :  ilahsiav



	//}


