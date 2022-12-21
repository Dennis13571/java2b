package myJava13;

class Ctest{
   public static void test() throws ArithmeticException{
		int num=12,den=0;
		int ans=num/den;
   }
}

public class Class08 {

	public static void main(String[] args) {
	

		try{
			Ctest.test();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end of main()");

	}

}
