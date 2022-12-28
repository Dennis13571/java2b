package myJava14;
import java.io.FileReader;
public class Class04 {

	public static void main(String[] args) {

		try {
			char data[]=new char[128];
			FileReader fr = new FileReader("d:\\donkey.txt");
		
		    int num=fr.read(data);
		    String str=new String(data);
		    System.out.println("Characters read= "+num);
		    System.out.println(str);
		    fr.close();
		} catch (Exception e) {
		}
		//不一樣，因為有\r\n
	}
}
