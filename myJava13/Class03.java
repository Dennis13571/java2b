package myJava13;

public class Class03 {

	public static void main(String[] args) {
		int num=12,den=0;
		try{
			int ans=num/den;
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("end of main()");
	}

}
