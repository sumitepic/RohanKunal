package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWrite {
	
	public String data1 ="Sumit";
	
	
	public void f1(String data) throws IOException{
		BufferedWriter brw= new BufferedWriter(new FileWriter(new File("WriteFile.txt"),true));
		brw.write(data);
		brw.close();
	}

	public static void main(String[] args) throws IOException {
		
		
		DataWrite obj = new DataWrite();
		obj.f1("Kunal");
		
	}
}
