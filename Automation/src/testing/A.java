package testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:/AR12.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello World");
		bw.flush();
		bw.close();
		System.out.println("Hello....");
	}

}
