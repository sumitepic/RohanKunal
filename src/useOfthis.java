
public class useOfthis {
	
	int a =19;
	
	// this is pointing to current clas object property
	public void f2(){
		int a =89;
		System.out.println(a);
	}
	
	public void f3(){
		int a =89;
		System.out.println(this.a);
		this.f2();
	}
	
	public static void main(String[] args) {
		useOfthis obj = new useOfthis();
		obj.f2();
	}

}
