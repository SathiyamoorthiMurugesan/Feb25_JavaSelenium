package a1BasicsOfJava;

public class A6PracticeMethodsWithParameter {
	
	static public void main(String[] args)
	{
		
		A6PracticeMethodsWithParameter obj=new A6PracticeMethodsWithParameter();
		obj.addMethod(10, 20);
		obj.subMethod(4.5f,4);
		obj.mulMethod(2.5f, 2.5f);
		obj.divMethod(10, 2);
		obj.stringMethod("manimekala");
	}
	
	public String stringMethod(String str)

	{
		System.out.println("This is string Method :"+str);
		return str;
	}
	
	public void addMethod(int a,int b)
	   {
		int c;
		c=a+b;
    	System.out.println("This is addition Method: "+c);
		
	   }
	protected void subMethod(float a,int b)
	    {
		float c;
		c=a-b;
		System.out.println("This is subtraction Mehtod :"+c);
			
		}
	private void mulMethod(float a,float b)
	   {
		float c;
		c=a*b;
		System.out.println("This is multiplication Method : "+c);
		
	    }
	void divMethod(int a,int b)
	{
		float c;
		c=a/b;
		System.out.println("This is division Method :"+c);
	}
	
}
