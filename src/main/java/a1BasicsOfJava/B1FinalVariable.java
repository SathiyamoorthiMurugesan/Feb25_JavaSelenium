package a1BasicsOfJava;

public class B1FinalVariable {
	
	int classLevelVariable;
	static int classLevelStaticVariable;
	//final int  classLvelFinalVariable; can't only declared,final variable should be declared and initialized.
	final int  classLevelFinalVariable=10;
	//static final int  classLevelStaticFinalVariable;//for static variable also can't only declared,final variable should be declared and initialized.
	static final int  classLevelStaticFinalVariable=40;
	public static void main(String[] args)
	{
		B1FinalVariable FinalVariableObject=new B1FinalVariable();
		
		FinalVariableObject.localFinalVariable();
	}
	
	public void localFinalVariable()
	{
		//here this variable is consider as a Local level variable and it can be declared alone
		
	final int LocalFinalVariable;
	LocalFinalVariable=100;
	
	System.out.println("LocalFinalVariable : "+LocalFinalVariable);
	final int LocalStaticFinalVariable;
	LocalStaticFinalVariable=55;
	System.out.println("LocalStaticFinalVariable : "+LocalStaticFinalVariable);
	}
}
