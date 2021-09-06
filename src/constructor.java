
public class constructor {
	int a;
	
	//Rohan
	public constructor(){
		a=10;
		System.out.println("Constructor");
	}
	
	public constructor(int b){
		a=10;
		System.out.println("Constructor B");
	}
	public void f1(){
		System.out.println("Sumit");
	}
	
	public void f1(int a){
		System.out.println("Sumit");
	}
	
	
	//sumit
	
	//Kunal
	
	// same function in same class but different parameter is known as overloading
	
	public static void main(String[] args) {
		constructor obj = new constructor();
		constructor obj1 = new constructor(10);
		
		obj.f1();
		obj1.f1();
	}

}
