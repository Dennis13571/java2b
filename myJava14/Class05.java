package myJava14;
import java.io.FileReader;
import java.io.BufferedReader;
public class Class05 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("d:\\donkey.txt");
			BufferedReader bfr=new BufferedReader(fr);
			
			bfr.readLine();
			String str;
		    while((str=bfr.readLine())!=null){
		         System.out.println(str);
		    }
		    fr.close();
		} catch (Exception e) {
		}
		//不一樣，因為有\r\n
	}
}
