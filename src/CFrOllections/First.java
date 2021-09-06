package CFrOllections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class First {
	
	int a =12;
	int[] a1 ={12,3,4,56};
	
	public void f11(){
		List list = new ArrayList();
		System.out.println(list);
		
		list.add(3);
		list.add("sumit");
		System.out.println(list);
		
		Object[] o2=list.toArray();
		
		System.out.println(o2[1]);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		list1.add(5);
		System.out.println(list1);
		list1.add(17);
		System.out.println(list1);
		System.out.println(list1.get(2));
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.remove(2);
		System.out.println(list1);
		
		Object[] o1=list1.toArray();
		
		System.out.println(o1[0]);
		
	}
	
	public void f12344(){
		Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(4);
		s1.add(4);
		s1.add(3);
		
		System.out.println(s1);
		
		for (Integer integer : s1) {
			System.out.println(integer);
		}
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public void f12(){
		Set<Integer> s1 = new HashSet<>();
		s1.add(4);
		s1.add(4);
		s1.add(3);
		
		System.out.println(s1);
		
		for (Integer integer : s1) {
			System.out.println(integer);
		}
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public void f13(){
		//Map<Key,Value>
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "Sumit");
		m1.put(1, "Ansh");
		System.out.println(m1);
		m1.put(2000, "Arnav");
		System.out.println(m1);
		System.out.println(m1.get(2));
		
		for (int i = 1; i <= m1.size(); i++) {
			System.out.println(m1.get(i));
		}
		
		Set<Integer> s1=m1.keySet();
		
		Object[] o1=s1.toArray();
		
		for (int i = 0; i < o1.length; i++) {
			System.out.println("Conversion="+m1.get(o1[i]));
		}
		
		
	}
	
	public void f333(){
		Map<Integer, List<String>> m1 = new HashMap<>();
		
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		
		m1.put(1, l1);
		
		System.out.println(m1);
		
		List<String> l2 = new ArrayList<>();
		l2.add("A1");
		l2.add("B2");
		l2.add("C2");
		l2.add("D2");
		
		m1.put(2, l2);
		System.out.println(m1);
		
		
	}

	public void f3334(){
		Map<Integer, List<String>> m1 = new HashMap<>();
		
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		
		m1.put(1, l1);
		
		//System.out.println(m1);
		
		List<String> l2 = new ArrayList<>();
		l2.add("A1");
		l2.add("B2");
		l2.add("C2");
		l2.add("D2");
		
		m1.put(2, l2);
		
		List<String> j2 = m1.get(1);
		System.out.println(j2.get(2));
		
		
	}
	
	public static void main(String[] args) {
		First obj = new First();
		obj.f3334();
	}
}
