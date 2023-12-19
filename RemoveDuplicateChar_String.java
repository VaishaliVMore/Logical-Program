package String_Program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar_String {

	   public static void main(String[] args) {
		
			String str = "Accolite"; 
			removeDuplicates(str); 
			} 
			static void removeDuplicates(String str) 
			{ 
			LinkedHashSet<Character> set = new LinkedHashSet<>(); //Create LinkedHashSet of type character
			for(int i=0;i<str.length();i++) //Add each character of the string into LinkedHashSet 
			set.add(str.charAt(i)); 

			// print the string after removing duplicate characters 
			for(Character ch : set) 
			System.out.print(ch); 
			} 
		}
//output-Acolite
//			----------------------------Method2----------------------------------------------------------------
			
//	public static void main(String[] args) 
//	{
//	        String str="Vaishali";
//			String remove="";
//			for(int i=0;i<=str.length()-1;i++)
//			{
//			  if(remove.indexOf(str.charAt(i))==-1) //indexoff---first occurance or first index position identified
//			   {
//			  remove=remove+str.charAt(i);
//			   }
//			 }
//			System.out.println(remove);
//			}
//	    }

       //	output-Vaishl

	
	//-----------------method3-by usig setIterator--------------------------------------------------------------------
	
//	          public static void main(String[] args) {
//	           String str = "Accolite"; 
//			   Set<Character>removeduplicates = new LinkedHashSet<>();
//			    char strarray[]= str.toCharArray();
//			    for(char c:strarray)
//			    {
//			        removeduplicates.add(c);
//			    }
//			    Iterator<Character> itr = removeduplicates.iterator();
//			    while(itr.hasNext())
//			    {
//			        System.out.print(itr.next());
//			    }
//	}
//	}
	//output-Acolite


			//----------------------------method4------------------------------------------------------------------

//			public static void main(String[] args) {
//			String s = "Vaishali";
//			String result = "";
//			for (int i = 0; i < s.length(); i++)
//			{
//			char ch = s.charAt(i);
//			if (ch != ' ') 
//			{
//			result = result + ch;
//			}
//			// Replacing space in all occurrence of the current character
//			s = s.replace(ch, ' ');
//			}
//			System.out.println("After removing duplicate characters : " + result);
//			}
//
//	}
      //output-After removing duplicate characters : Vaishl


