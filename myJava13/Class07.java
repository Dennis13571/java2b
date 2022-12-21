package myJava13;

public class Class07 {
   public static void test() throws ArithmeticException{
		int num=12,den=0;
		int ans=num/den;
   }
	public static void main(String[] args) {
	

		try{
			test();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end of main()");

	}

}
