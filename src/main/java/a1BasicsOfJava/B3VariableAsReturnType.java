package a1BasicsOfJava;

/* ************* Return Type in Java ********************
 * * If a method has void as a return type, it wont return anything
 * * Return type can be anything (datatypes, class, or interface, etc)
 * * When a method has a return type mentioned (for eg: String)
 * 		* It should return the same type (here a String should be returned)
 * 		* return key word should be the last line of the method
 * 		* We can not write anything after return. 
 * * We can not have two methods with same method names and different return types
 * 		* If we do so, we will get error.
 * 		* Because while calling the method, we use only the method name. Not the return type
 * 		* So Java will confuse which method (void method or return type method) we are calling
 * * At the same time, we can create multiple methods with same name and different parameters
 * 		* While calling the method, we use the parameter
 * 		* Based on the parameter, Java can identify the respective method.
 */

public class B3VariableAsReturnType {

	public static void main(String[] args) {
		B3VariableAsReturnType obj = new B3VariableAsReturnType();
		obj.buySoap();
		obj.buySoap(0);
		obj.buySoap("1");
	}

	public void buySoap() {
//		This method does some work but wont return anything.
		System.out.println("Bought Soap");
	}
	
//	public char buySoap() {
//		System.out.println("Hello");
//	}
	
	public void buySoap(int a) {
				
	}
	
	public char buySoap(String a) {
		
//		return 'a';
//		return '1';
		return '@';
	}

	public String buySoapAndReturnTheSoap() {

//		This method does some work and return us a 'String'

//		System.out.println("Bought Hamam Soap and returned");
//		System.out.println("Bought Lux Soap and returned");
		return "Hamam";
//		System.out.println("hello");
	}

	public int buySoapAndReturnTheBalaceAmount() {
		return 0;
	}

	public String BringYourFriendToHome() {

//		return 010;
		return "Mani";
	}
	
//	When a method has a local variable
	public int method1() {
		int a = 10;
		String abc = "hello";
		int b;
		int c = 100;
		
//		return a;
//		return 0;
//		return 100;
//		return b =0;
		return c = 20;
	}
	
	int aa = 10;
	public int method2() {
		
//		return 100;
		return aa;
		
	}
	
	

}
