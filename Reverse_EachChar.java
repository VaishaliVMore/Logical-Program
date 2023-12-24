package String_Program;

public class Reverse_EachChar {

	public static void main(String[] args) {
		{
		String originalString="vaishali more";
		String reverseString="";
		String[]words=originalString.split(" ");
		for(String w: words)
		{
		String reverseword="";
		for(int i=w.length()-1;i>=0;i--)
		{
		reverseword=reverseword+w.charAt(i);
		}
		reverseString=reverseString+reverseword + " ";
		}
		System.out.println("print reverse string : "+ reverseString);
		}
		}
}
//		Output- print reverse string : ilahsiav erom 


	//--------------------------------Method2------------------------------------------------------------------------

//		public static void main(String[] args) {
//		String str="xyz abc";
//		String[]words=str.split("\\s ");
//		String reverseword="";
//		for(String w: words)
//		{
//			StringBuilder sb=new StringBuilder(w);
//			sb.reverse();
//			reverseword=reverseword+sb.toString()+" ";
//			}
//		     System.out.println("print reverse string "+ reverseword);
//		}
//		}
//output-print reverse string cba zyx 


	


