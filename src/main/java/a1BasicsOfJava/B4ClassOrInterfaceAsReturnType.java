package a1BasicsOfJava;

public class B4ClassOrInterfaceAsReturnType {
	
//	Same like class, you can also return an interface as a return type of a method.
	
	ABC abc; //Variable created for class. (like - int a)
	B4ClassOrInterfaceAsReturnType b4;

	public static void main(String[] args) {
		B4ClassOrInterfaceAsReturnType obj = new B4ClassOrInterfaceAsReturnType();
		int aa = obj.methodAA();
		
		ABC myName = obj.methodB();  //ABC myName = new ABC();
		myName.method1();
		System.out.println(myName.a);
		
		
		obj.b4 = obj.methodC(); //assigned the methodC()'s return type to class level variable 'b4';
		obj.b4.methodAA();
		obj.b4.methodB(); // here obj.b4 = obj.methodC();
		obj.methodC().methodB();
		
//		Java example for Class as a return type - String class
		
		String abc = "Sathya"; 
		String upper = abc.toUpperCase(); //upper = "SATHYA";
		String lower = upper.toLowerCase(); //lower = "sathya";
		
		String lower1 = abc.toUpperCase().toLowerCase(); //"SATHYA".toLowerCase(); //"sathya";
		String lower2 = "Sathya".toUpperCase().toLowerCase();
		
//		Java example for interface as a return type - List interface 
		
//		List<E> java.util.ArrayList.subList(int fromIndex, int toIndex)
		
//		java.util - package
//		ArrayList - className 
//		subList(int, int) - method
//		List - return type (List is a interface in Java)
		
	}
	
	public void methodA() {
		System.out.println("I am method from B4ClassAsReturnType class and return type void");
	}
	
	public int methodAA() {
		return 100;
	}
	
	public ABC methodB() {
		System.out.println("I am method from B4ClassAsReturnType class and return ABC class");
		return abc;
	}
	
	public B4ClassOrInterfaceAsReturnType methodC() {
		System.out.println("I am method from B4ClassAsReturnType class and return same class");
		return b4;
	}
	
	AA aa;
	public AA methodD() {
		
		return aa;
	}

}

class ABC {
	
	int a = 100;
	static String str = "Hello";
	
	public void method1() {
		System.out.println("I am a non-static method from Class ABC");
	}
	
	public static void method2() {
		System.out.println("I am a static method from Class ABC");
	}
}

class BDE {
	
	public void methodB1() {
		System.out.println("I am method from B1 class");
	}
}

interface AA {
	
	public void method11();
}


