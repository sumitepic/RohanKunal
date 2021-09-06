package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Second {
	
	public void f1() throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.load(new FileReader(new File("Read.properties")));
		System.out.println(prop.get("emp1"));
	}

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Second obj = new Second();
		obj.f1();
	}
}
