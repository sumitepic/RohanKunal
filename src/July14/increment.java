package July14;

public class increment {

	int i =19;
	public void f1(){
		int i =10;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
	}
	
	public static void main(String[] args) {
		increment obj = new increment();
		obj.f1();
	}
}
