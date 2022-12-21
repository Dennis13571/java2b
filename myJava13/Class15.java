package myJava13;
import java.io.*;
class ArgumentOutOfBound extends Exception{
	public ArgumentOutOfBound() {
		System.out.println("n小於0");
	}
}

public class Class15 {
	static void mySqrt(int n) throws ArgumentOutOfBound {
		if(n > 0) {
			System.out.println(Math.sqrt(n));
		}else {
			throw new ArgumentOutOfBound();
		}
	}
	public static void main(String[] args) {
	      BufferedReader buf;
	      int i;
	      buf=new BufferedReader(new InputStreamReader(System.in));
	      try{
	         i=Integer.parseInt(buf.readLine());
	         mySqrt(i);
	      }
	      catch(Exception e){}
	}

}
