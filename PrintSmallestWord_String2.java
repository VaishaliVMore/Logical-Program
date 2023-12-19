package String_Program;

import java.util.Scanner;
public class PrintSmallestWord_String2 {


    public static void main(String[] args) {
    	
    	//-----------------------method1-----------------

//        // Read input string
//        
//        String input = "I love my India";
//
//        // Split the string into words
//        String[] words = input.split(" ");
//
//        // Initialize the smallestWord with the first word
//        
//        String smallestWord = words[0];
//
//        // Iterate through the words to find the smallest one
//        for (String word : words) 
//        {
//            // Compare the length of the current word with the length of the smallest word
//            if (word.length() < smallestWord.length())
//            {
//                smallestWord = word;
//            }
//        }
//        System.out.println("Smallest word in the string: " + smallestWord);
//
//         }
//}
    	//output-Smallest word in the string: " I
//		
    //------------------------method2-------------------------------------------------
    	
    	String s= "Today the happiest day of my life by vijayakumar";
    	String [] word = s.split(" ");
    	String smalllethWord =word[0];
    	for(int i = 1; i < word.length; i++)
    	{
    	if(word[i].length() <smalllethWord.length())
    	{
    	smalllethWord = word[i];
    	} 
    	}
    	System.out.println("Smallest word in given string is  :" +smalllethWord); 
    	}
    	}
//output-Smallest word in given strinSmallest word in given string is  : of