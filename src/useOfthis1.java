
public class useOfthis1 {
	
	int a ;
	
	public void setA(int a){
		this.a=a;
	}
	
	public void getA(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		useOfthis1 obj = new useOfthis1();
		obj.setA(10);
		obj.getA();
	}

}
