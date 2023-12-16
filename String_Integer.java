package String_Program;

public class String_Integer {

	public static void main(String[] args) {
		
		String s="1234";
		int num=Integer.parseInt(s); //--------------------------method1
		System.out.println(num);
	
		
		int num1=Integer.valueOf(s);//----------method2
		System.out.println(num1);
		
		int num3=new Integer(s).valueOf(s);//----------------method3
		System.out.println(num3);
		
		

	}

}
