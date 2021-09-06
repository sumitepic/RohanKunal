
public class overloading {
	int a;
	
	public overloading(){
		a=10;
		System.out.println("Constructor");
	}
	
	public overloading(int b){ // overload constructor
		a=b;
		System.out.println("Constructor B");
	}
	
	public void f1(){// same function in same class but different parameter is known as overloading
		System.out.println(a);
		System.out.println("Sumit");
	}
	
	public void f1(int a){// same function in same class but different parameter is known as overloading
		System.out.println("Sumit");
	}
	
	
	public static void main(String[] args) {
		overloading obj = new overloading();
		obj.f1();
		
		overloading obj1 = new overloading(100);
		obj1.f1();
	}

}
