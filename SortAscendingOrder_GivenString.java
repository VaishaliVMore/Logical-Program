package String_Program;

import java.util.Arrays;

public class SortAscendingOrder_GivenString {

//	public static void main(String[] args) {
//		
//			String s="vaishali";
//			char arr[]=s.toCharArray();
//			Arrays.sort(arr);
//			System.out.println((arr));
//			}
//	}
	//output-aahiilsv
	
		//	-------------------------------------------without sortmethod--------------------------
	
          public static void main(String[] args) {
			String s="vaishali";
			char[] arr=s.toCharArray();
			char temp;
			for(int i=0;i<arr.length;i++)
			{
			for(int j=i+1;j<arr.length;j++)
			{
			if (arr[i]>arr[j]) 
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			}
			}
			System.out.println((arr));
			}
			}
			//output= aahiilsv
