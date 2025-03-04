package a1BasicsOfJava;

public class A7 {

//	Mostly we will deal with non-static methods

	public static void main(String[] args) {
		A7 obj = new A7(); // local object
		obj.buySoap(); // calling the method

//		obj.buySoapAndShampoo();

		obj.buySoap("Lux");
		obj.buySoap("Hamam");
		obj.buySoap("Conthol");

	}

	public void buySoap() { // called method
		System.out.println("Bought soap");
	}

//	public void buySoap() { // duplicate method
//		System.out.println("Bought soap");
//	}

	public void buyShampoo() {
		System.out.println("Bought Shampoo");
	}

	public void buySoapAndShampoo() {
//		System.out.println("Bought soap");
//		System.out.println("Bought Shampoo");

		buySoap(); // method calling
		buyShampoo();// method calling

		A7 obj = new A7(); // local object
		obj.buySoap();
		obj.buyShampoo();
	}

	public void buyHamamSoap() {
		System.out.println("Bought Hamam soap");
	}

	public void buyLuxSoap() {
		System.out.println("Bought Lux soap");
	}

	public void buyCintholSoap() {
		System.out.println("Bought Cinthol soap");
	}

//	obj.buySoap("Hamam");
//	String soapName = "Hamam";
	public  void buySoap(String soapName) { //Here soapName is the parameter and String is the datatype
		
		System.out.println("Bought "+soapName+" soap");
		
		
//		System.out.println("Bought \"Hamam\" soap");
//		System.out.println("Bought soapName soap");
//		System.out.println("Bought +soapName+ soap");
//		System.out.println("Bought"+soapName+"soap");
//		System.out.println("Bought"   +   soapName    +   "soap");
	/*
		String str = "Sathya";
		String str1 = "I am learning java for past 3 years using @gmail";
//		I am learning "Java" for past 3 years using @gmail - I want to print like this in Console
//		String str2 = "I am learning "Java" for past 3 years using @gmail";
		String str2 = "I am learning \"Java\" for past 3 years using @gmail";
		String str3 = ""; //Empty
		String str4 = "    "; //Blank. 
		//In Java, space also considered as a character.
//		String str5;
		String str5 = null;
		String str6 = "null";
	*/
	}

}
