package a9InheritanceInJava;

public class A1LearnInheritance {
	
//	Every class in java is always extended by Object class
//		* Object class is the root class of Java
	
//	Parent class/ Super class
//	Child class/ Sub class
	
//	Inheritance is the property of using the parent class variables/methods in child class
//	extends and implements are the java keywords, used to achieve inheritance.
//	For Class to Class inheritance or Interface to Interface or Class to AbstractClass or AbstractClass to Class or Abstract class to Abstract class - we use extends keyword 
//	For Class to Interface we use implements
//	An Interface never follows a Class.
	
//	*	All the classes we create in Java is extended to Object class
//		1) interface List<E> extends Collection<E> (Java example - interface to interface)
//		2) Ex: WebDriver interface extends SearchContext interface (Selenium example - interface to interface)
//		3) Ex: ChromiumDriver class extends RemoteWebDriver class(Selenium example - Class to Class)
//		4) Ex: ChromeDriver class extends ChromiumDriver class (Selenium example - Class to Class)
//					ChromeDriver - child
//					ChromiumDriver - parent 
//					RemoteWebDriver - G.Parent
//		5) Ex: abstract class AbstractSequentialList<E> extends AbstractList<E> (Java example - Class to Class)
//	For Class to interface inheritance - we use implements keyword 
//		1) Ex: Throwable class implements Serializable interface
//		2) Ex: RemoteWebDriver class implements WebDriver interface
//					ChromeDriver - child class
//					ChromiumDriver - parent class
//					RemoteWebDriver - G.Parent class
//					WebDriver - G.G.Parent interface
	
	
//	Multiple inheritance in Java 
//		1) is not possible by using Classes alone. So below line wont work
//			a) ClassA extends ClassB, ClassC, etc... 
//		2) is possible by using interfaces alone.
//			a) ClassA implements interface1, interface2, etc..
//			b) InterfaceA extends Interface1, interface2, etc..
//		3) is possible by using classes and interface together. In this case, class name should be mentioned at first
//			a) ClassA extends ClassB implements interface1, interface2, interface3
//					a) ClassA extends ClassB
//					b) ClassA implements interface1, interface2, interface3 
//			b) ClassA implements interface1, interface2 extends ClassB - THIS IS NOT RIGHT ORDER TO WRITE
//					a) ClassA extends ClassB
//  				b) ClassA implements interface1, interface2, interface3 
	
//	Multilevel inheritance in Java
//		1) is possible 
//			a) ClassA extends ClassB
//			b) ClassB extends ClassC
	
//	public class Test1 extends Test2, Test3; - In Java This is not possible
//	public interface abc1 extends abc2, abc3; - In Java this is possible
//	public class Test1 extends Test2 implements abc1, abc2; POSSIBLE
//	public class Test1 extends Test2, Test3 implements abc1, abc2; NOT POSSIBLE
//	public class Test1 implements abc1, abc2; POSSIBLE
//	Public class Test1 implements abc1, abc2 extends Test2; NOT POSSIBLE

//	Diamond problem
//		ClassA extends ClassB
//		ClassB extends ClassC
//		ClassC extends ClassA
	
//	Where do we use multiple inheritance
//		public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable (java example)
//  	public interface WebElement extends SearchContext, TakesScreenshot (selenium example)
//		public class RemoteWebDriver implements WebDriver, JavascriptExecutor,
//        HasCapabilities,
//        HasVirtualAuthenticator,
//        Interactive,
//        PrintsPage,
//        TakesScreenshot (selenium example)
	
//	Where do we use multilevel inheritance
//		public class ArithmeticException extends RunTimeException;
//		public class RunTimeException extends Exception;
//		public class Exception extends Throwable;
//		public class Throwable implements Serializable;
	
	
	public static void main(String[] args) {
		
//		InheritanceInterface1 obj1 = new InheritanceInterface1();
		
//		A1LearnInheritance obj2 = new A1LearnInheritance();
//		obj2.interfaceMethod1();
//		obj2.interfaceMethod2();
//		obj2.testMethod1();
		
		A2InheritanceInterface.interfaceMethod3();
		
		Exception obj1 = new Exception();
		Exception obj12;
		Exception e;
		
		ArithmeticException ae;
		
//		ArrayList

	}
	
//	WebDriver
	
//	RemoteWebDriver
//	ChromiumDriver
//	ChromeDriver
	
//	List
	
	

}
