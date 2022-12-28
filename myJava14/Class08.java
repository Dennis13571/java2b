package myJava14;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Class08 {

	public static void main(String[] args) {
		String sum = "";
		String str = "";
		try {
			FileReader file = new FileReader("D:\\aaa.txt");
			BufferedReader br = new BufferedReader(file);
			str = br.readLine();
			System.out.println(str);
			sum += str;
			
			file = new FileReader("D:\\bbb.txt");
			br = new BufferedReader(file);
			str = br.readLine();
			System.out.println(str);
			sum += str;
			br.close();
			file.close();
			
			File myfile = new File("D:\\ccc.txt");
			if(myfile.createNewFile()) {
				System.out.println("File created.");
				FileWriter writer = new FileWriter("D:\\ccc.txt");
				System.out.println(sum);
				writer.write(sum);
				writer.close();
				System.out.println("File writed.");
			}else {
				System.out.println("File created already.");
			}
		} catch (IOException e) {
			System.out.println("not found.");
		}
	}

}
