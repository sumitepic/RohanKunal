
public class visibilityOfLocalAndGlobal {
	
	int a =10;
	
	public void f2(){
		a=89;
		
		System.out.println(a);
		int a =19;
		System.out.println(a);
	}
	
	public void f3(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		visibilityOfLocalAndGlobal obj = new visibilityOfLocalAndGlobal();
		obj.f2();
		obj.f3();
	}
	

}
