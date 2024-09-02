package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		File f= new File("M:\\staragile\\java\\test.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("First Line\n");
		bw.newLine();
		bw.write("Second Line\n");
        bw.close();		

	}

}
