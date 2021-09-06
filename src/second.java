
public class second {
	
	 int a =90;
	
	public static void f3(){
		second obj = new second();
		System.out.println(obj.a);
		LocalAndGlobalVariable obj1 = new LocalAndGlobalVariable();
		System.out.println(obj1.a);
		System.out.println(obj1.v);
		System.out.println(LocalAndGlobalVariable.v);
	}
	
	public static void main(String[] args) {
		second obj = new second();
		System.out.println(obj.a);
		System.out.println(first.a);
		f3();
	}

}
