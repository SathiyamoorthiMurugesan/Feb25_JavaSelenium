package a2accessModifiers1;

public class ClassA {

	int a = 10;
	private int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public void same() {
		ClassA obj = new ClassA();
//		obj.a; //10;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
	
	}


