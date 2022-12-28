package myJava14;
import java.util.Scanner;
public class Class02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a = a.toUpperCase();
		System.out.println(a);
		sc.close();
	}

}
