package ExceptionHandling;

import FileHandling.DataWrite;

public class first extends DataWrite {

	int b = 9;
	int[] a = { 1, 2, 3, 4 };

	DataWrite dr = new DataWrite();
	public void f1() {
		try {

			System.out.println(data1);
			System.out.println(2);
			System.out.println(a[3]);
			String s = "Sumi1t";

			if (s.equals("Sumit")) {
				System.out.println("All OK");
			} else {
				throw new Exception();
			}
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
			if (e1 instanceof ArithmeticException) {
				System.out.println("arithmatic ");
			} else if (e1 instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Array exception");
			}
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
	}

	public void f2() {
		System.out.println("F2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void f3() throws Exception{
		throw new CustomException();
		//throw new Exception();
	}
	
	public void f4() throws Exception {
		f3();
	}

	public static void main(String[] args) {
		first obj = new first();
		obj.f1();
		obj.f2();
	}

}
