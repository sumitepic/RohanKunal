package StringClass;

public class First {

	String s= "Sumit";
	
	public char f1(){
		System.out.println("F1");
		System.out.println(s.charAt(3));
		char c = s.charAt(3);
		System.out.println(c);
		return c;
	}
	
	public void f3(){
		String g ="Sumit,Agarwal,Pune";
		int a = g.indexOf(",");
		int b = g.lastIndexOf(",");
		System.out.println(g.substring(a+1, b).toUpperCase().toLowerCase());
		String s =g.substring(a+1, b).toUpperCase().toLowerCase();
		String h= s.trim();
		System.out.println(h);
	}
	
	public void f5(){
		String g ="Sumit,Agarwal,Pune";
		String[] g1= g.split(",");
		//System.out.println(g1[0]);
		for (int i = 0; i < g1.length; i++) {
			System.out.println(g1[i]);
			
		}
		
	}
	
	public void f7(){
		String h ="Sumit";
		System.out.println(h.contains("it"));
	}
	
	public void f8(){
		String h ="Sumit";
		String h1 ="sumit";
		if(h.equals(h1)){
			System.out.println("equal");
		}else if (h.equalsIgnoreCase(h1)) {
			System.out.println("case ignore equal");
		}
	}
	
	public void f9(){
		String g = "a2cd";
		char[] p= g.toCharArray();
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}

	
	public void f4(){
		String g ="Sumit";
		char[] c= g.toCharArray();
		for (int i = c.length-1; i >=0; i--) {
			System.out.println(c[i]);
		}
	}
	
	public void f99(){
		String a ="Sumit";
		String b ="Aga";
		System.out.println(a.concat(b));
		System.out.println(a+b);
	}
	
	public void f2(){
		f1();
		System.out.println(f1());
	}
	public static void main(String[] args) {
		First obj = new First();
		obj.f99();
	}
}
