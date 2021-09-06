
public class parametrization {


	public int work(int a){
		return a;
	}
	
	
	public void salary(int salryperHour,int a){
		int sal= salryperHour* work(a);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args) {
		parametrization obj = new parametrization();
		obj.salary(9,700);
		obj.salary(100,12);
		obj.salary(500,1);
	}
}
