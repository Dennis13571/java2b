package myJava14;
import java.io.FileReader;
import java.io.IOException;
public class Class06 {

	public static void main(String[] args) {
	      char data[]=new char[128]; // �إߥi�e��128�Ӧr�����}�C
	      FileReader fr;
		try {
			fr = new FileReader("c:\\Java\\train.txt");
		    int num=fr.read(data);     // �N���Ū�J�r���}�Cdata��
		    String str=new String(data,0,num);     // �N�r���}�C�ഫ���r��
		    System.out.println("Characters read= "+num);
		    System.out.println(str);

		    fr.close();
		} catch (IOException e) {
		}


	}

}
