package String_Program;

public class PrintLongestWord_String {
	//------------------------------method1---------------------------------------

	public static void main(String[] args) {
//		String str="I love my India";
//		String s[]=str.split(" ");
//		String emp=" ";
//		for(String word : s)
//		{
//		if(word.length()>emp.length())
//		{
//		emp=word;
//		}
//		}
//		System.out.println("Longestword in given string is  : "+emp);
//		}
//

	//output-Longestword in given string is  :India

//----------------------------method2-------------------------------------------------------
String s= "Today is the happiest day of my life by vijayakumar";
String [] word = s.split(" ");
String maxlethWord = "";
for(int i = 0; i < word.length; i++)
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

