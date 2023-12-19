package String_Program;

public class PrintLongestWord_String {
	
	//------------------------------method1---------------------------------------

	public static void main(String[] args) {
//		String str="I love my India";
//		String words[]=str.split(" ");
//		String maxlengthword=words[0];
//		for(String word : words)
//		{
//		if(word.length()>maxlengthword.length())
//		{
//			maxlengthword=word;
//		}
//		}
//		System.out.println("Longestword in given string is  : "+maxlengthword);
//		}}


	//output-Longestword in given string is  :India

//----------------------------method2-------------------------------------------------------

		
String s= "Today is the happiest day of my life by vijayakumar";
String [] word = s.split(" ");
String maxlethWord = word[0];
for(int i = 1; i < word.length; i++)
{
if(word[i].length() >= maxlethWord.length())
{
maxlethWord = word[i];
} 
}
System.out.println("Longestword in given string is  :" +maxlethWord); 
}
}
//output-Longestword in given string is  :vijayakumar

