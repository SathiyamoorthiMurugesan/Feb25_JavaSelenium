package a9InheritanceInJava;

public interface A2InheritanceInterface {
	
	int a =10;
	
	public void interfaceMethod1();
	
	default void interfaceMethod2() {
		System.out.println("I am default method from inheritanceInterface1 interface");
	}
	
	public static void interfaceMethod3() {
		System.out.println("I am static method from inheritanceInterface1 interface");
	}
	
//	public static void interfaceMethod4();
	

}
