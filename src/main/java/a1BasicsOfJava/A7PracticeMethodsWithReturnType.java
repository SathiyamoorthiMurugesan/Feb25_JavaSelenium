package a1BasicsOfJava;

public class A7PracticeMethodsWithReturnType {

	
		 public static void main(String[] args)
		{
			
			 A7PracticeMethodsWithReturnType obj=new A7PracticeMethodsWithReturnType();
		
			System.out.println("This is addition Method :"+ obj.addMethod(10, 20));
			System.out.println("This is subtraction Mehtod :" +obj.subMethod(4.5f,4));
			System.out.println("This is multiplication Method : "+obj.mulMethod(2.5f, 2.5f));
			System.out.println("This is division Method :"+obj.divMethod(10, 2));
			System.out.println("This is String Upper Method :" + obj.stringUpperMethod("manimekala"));
		}
		
		/**
		 * @param str
		 * @return
		 */
		public String stringUpperMethod(String str)

		{
			//String str1=new String();
			str=str.toUpperCase();
			return str;
		}
		
		public int addMethod(int a,int b)
		   {
			int c;
			c=a+b;
	    	return c;
	    	}
		protected float subMethod(float a,int b)
		    {
			float c;
			c=a-b;
			return c;
			}
		private float mulMethod(float a,float b)
		   {
			float c;
			c=a*b;
			return c;
		    }
		int divMethod(int a,int b)
		{
			int c;
			c=a/b;
			return c;
		}
		
	}
