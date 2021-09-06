
public class LocalAndGlobalVariable {
	
	int a =10; //Global varibale
	static int v =89;
	
	String f2(){
		int b =8; //Local variable
		String c ="Sumit"; //Local variable
		System.out.println(b);
		return c;
	}
	
	public void f3(){
		String d =f2();
		System.out.println(d);
		System.out.println(a);
	}
	
	public void f1(){
		System.out.println(a);
	}
	
	public double f6(){
		double b =9.8f;
		System.out.println(b);
		return b;
	}
	
	void f7(){
		double t=f6();
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		LocalAndGlobalVariable obj = new LocalAndGlobalVariable();
		obj.f3();
	}
	
}
