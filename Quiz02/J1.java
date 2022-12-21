package myJava14;
import java.util.Scanner;
class RuntimeExceptio extends Exception{
	public RuntimeExceptio(String str) {
		System.out.println(str);
	}
}
public class J1 {

	public static void main(String[] args) throws RuntimeExceptio {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		String str1;
		String str2;
		System.out.println("密碼輸入測試");
		System.out.println("請輸入密碼:");
		str1 = sc.nextLine();
		int a = 0;
		while(a < 3) {
			System.out.print("請再輸入密碼:");
			str2 = sc.nextLine();
			if(str1.equals(str2)) {
				break;
			}else {
				System.out.println("與第一次輸入不同!");
				c++;
			}
			a++;
		}
		
		if(c >= 3) {
			sc.close();
			throw new RuntimeExceptio("輸入三次錯誤！程式停止！");
		}else {
			System.out.println("密碼正確");
		}
		sc.close();
	}

}