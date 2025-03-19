package a1BasicsOfJava;

public class B9ConstructorWithFinal {
	
	//for final variable once declared and initialized value,value cannot be changed.
	// we can't declare class level variable without initializing value.but using constructor ,class level final variable can be declared. 
	// we should assign value for class level final variable,when we create constructor. 
	//In a constructor we can assign value only once for class level final variable,once value is assigned,we can't re assign the value. 
	//we can create and assign value to class level final variable using more than one constructor 
	
	
	//Once a final variable is declared and initialized, its value cannot be changed.
	//A class-level final variable must be initialized when declared. 
	//but using constructor,class level final variable can be declared and it can be initialized within the constructor 
	//class-level final variable must be assigned a value when the constructor is created.
	//class level final variable value can be assigned only once within the constructor and cannot be reassigned..
	//when create object variable for each constructor the class level final variable value will be stored in heap memory
	//we can't initialize class level final static variable within constructor ,it should be initialized when it is declared
	
	public final int a = 20; 
	public final int b;
	
	public B9ConstructorWithFinal() {
		b = 20;
//		b = 21;
	}
	
	public B9ConstructorWithFinal(int a) {
		b = 200;
	}
	
	public B9ConstructorWithFinal(char a) {
		b = 100;
	}

	public static void main(String[] args) {
		B9ConstructorWithFinal obj = new B9ConstructorWithFinal();
		obj.method1();
		
		B9ConstructorWithFinal obj1 = new B9ConstructorWithFinal(10);
		obj1.method1();
		obj.method1();
	}
	
	public void method1() {
		System.out.println("The value of variable b is: "+b);
		System.out.println(b+100);
	}

}
