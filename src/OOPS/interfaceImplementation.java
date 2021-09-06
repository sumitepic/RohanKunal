package OOPS;

public class interfaceImplementation implements interfaceDemo{

	public void f1() {
		System.out.println("F1");
		System.out.println(a);
	}

	
	public void f2() {
		System.out.println("F2");
	}
	
	
	public static void main(String[] args) {
		interfaceDemo obj = new interfaceImplementation();
		obj.f1();
	}

}
