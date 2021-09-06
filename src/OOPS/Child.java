package OOPS;

public class Child extends Parent{

	public void f1(){
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.f1();
	}
}
