package OOPS;

public class User {

	int a =9;
	
	public void getHomeLoan(Bank bank) {
		System.out.println(bank.homeLoan());
	}
	
	public void f1(int a){
		
	}

	public static void main(String[] args) {
		User loan = new User();
		loan.getHomeLoan(new Icici());
		loan.getHomeLoan(new SBI());
	}

}
