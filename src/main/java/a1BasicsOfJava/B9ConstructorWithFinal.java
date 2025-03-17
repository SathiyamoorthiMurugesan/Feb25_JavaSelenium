package a1BasicsOfJava;

public class B9ConstructorWithFinal {
	
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
