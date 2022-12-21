package myJava14;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class J2 {

	public static void main(String[] args) {
		try {
			File myfile = new File("rand.txt");
			if(myfile.createNewFile()) {
				FileWriter file = new FileWriter("rand.txt");
				BufferedWriter writer = new BufferedWriter(file);
				for(int i=0; i<1000;i++) {
					writer.write(String.valueOf((int)(Math.random()*99998 + 1)));
					writer.newLine();
				}
				writer.close();
			}else {
				System.out.println("File created already.");
			}
		} catch (IOException e) {
		}
	}
}
