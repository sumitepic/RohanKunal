package loop;

public class first {
	
	
	
	public void f2(){
		for(int i=0;i<10;i=i+2){
		System.out.println(i);
		}
	}
	
	public void f3(){
		for(int i=2;i<11;i++){
			for (int j = 1; j < 11; j++) {
				System.out.println("Table of "+i+"="+i*j);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		first obj = new first();
		obj.f3();
	}

}
