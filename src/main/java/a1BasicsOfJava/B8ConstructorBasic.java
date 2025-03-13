package a1BasicsOfJava;

public class B8ConstructorBasic {
	
	// * Every class has its own constructor and we call it as default constructor;
	// * Default constructor is implicitly present inside the class;
	// * Nature of Constructor
//			* Its name MUST be same as Class name
//			* Constructor should not be having any return type
	// * Syntax	
//			* accessModifier ClassName() {
//				
//			}
	// * Constructor also belongs to the class. So we dont need to mention it as "static"
	// * When we create an Object for a class, default constructor is being called.
	// * We can also parameterize the constructor
	// * When the default constructor was implicitly present and you create a Constructor with parameter
//			* Then the default constructor will vanish. 
//			* Which means, we can not create a object for the class using default constructor.
	// * We can create a constructor using public, private, protected and default(do not use the keyword)
//			* When Constructors is private, we can not create object of that class in other classes.
	
//	**************************************************************
	
//		This is the default constructor and we have explicitly wrote it
//		Why it is called as default constructor is because it does not have any parameters
	public B8ConstructorBasic() {
		System.out.println("I am the default constructor and written explicitly");
	}
	
//	This is default constructor but it is implicitly present. 
//	For understanding purpose, I have commented it.
//	public B8ConstructorBasic() {
//		It does not have any coding inside it.
//	}
	
	

	public static void main(String[] args) {
		B8ConstructorBasic basicConstructor = new B8ConstructorBasic();
		
	}

}
