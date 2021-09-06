package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataReadingThroughMap {

	public void f1() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("ReadingData.txt")));
			String data;

			while ((data = br.readLine()) != null) {
				System.out.println(data);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void f2() {
		BufferedReader br = null;
		File file = new File("ReadingData.txt");
		try {
			br = new BufferedReader(new FileReader(file));
			String data;

			while ((data = br.readLine()) != null) {
				System.out.println(data);
				String[] getData=data.split("=");

				mapRead(getData[0], getData[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	Map<String, String> m1 = new HashMap<String, String>();
	public void mapRead(String key, String value){
		//Map<Key,Value>
		
		m1.put(key, value);
		
		Set<String> s1=m1.keySet();
		
		Object[] o1=s1.toArray();
		
		for (int i = 0; i < o1.length; i++) {
			System.out.println(m1.get(o1[i]));
		}
		
	}
	
	
	Map<String, List<String>> multipleRead = new HashMap<String, List<String>>();
	List<String> list =  null;		;
	
	
	public void multipleData() {
		BufferedReader br = null;
		File file = new File("ReadingData.txt");
		try {
			br = new BufferedReader(new FileReader(file));
			String data;

			while ((data = br.readLine()) != null) {
				System.out.println(data);
				String[] getData=data.split("=");
				list =  new ArrayList<String>();
				for (int i = 1; i < getData.length; i++) {
					list.add(getData[i]);
				}

				mapMultipleValueRead(getData[0],list);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	
	public void mapMultipleValueRead(String key, List<String>value){
		//Map<Key,Value>
		
		multipleRead.put(key, value);
		
		Set<String> s1=m1.keySet();
		
		Object[] o1=s1.toArray();
		
		for (int i = 0; i < o1.length; i++) {
			System.out.println(m1.get(o1[i]));
		}
		
	}
	
	public void mapMultipleDataRead(String key, String value){
		//Map<Key,Value>
		
		m1.put(key, value);
		
		Set<String> s1=m1.keySet();
		
		Object[] o1=s1.toArray();
		
		for (int i = 0; i < o1.length; i++) {
			System.out.println(m1.get(o1[i]));
		}
		
	}
	
	public void f4(){
		System.out.println("Different"+m1.get("emp2"));
	}
	
	
	public void f56(){
		String a ="A";
		String b ="B";
		
		f7(a,b);
	}
	
	public void f7(String c, String d){
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) throws IOException {
		DataReadingThroughMap obj = new DataReadingThroughMap();
		//obj.f2();
		//obj.f4();
		obj.multipleData();
	}
}
