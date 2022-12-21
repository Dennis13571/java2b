package myJava13;
import java.util.Scanner;
class Exception520 extends Exception{
}



public class Class13 {
	static void a(String a) throws Exception520{
		if(a.equals("520")) {
			throw new Exception520();
		}else{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			a(sc.nextLine());
		}catch(Exception e) {
			System.out.println("這是由字串520所引起的例外");
		}
	}
}
