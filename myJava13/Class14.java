package myJava13;

import java.util.Scanner;

class IntegerTooSmall extends Exception{
	public IntegerTooSmall() {
		System.out.println("你輸入的整數的值太小");
	}
}
class IntegerTooLarge extends Exception{
	public IntegerTooLarge() {
		System.out.println("你輸入的整數的值太大");
	}
}
class InputMismatchException extends Exception{
	public InputMismatchException() {
		System.out.println("你輸入的不是整數");
	}
}
public class Class14 {
	public static void main(String[] args) throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int a = 11;
		try{
			a = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("你輸入的不是整數");
		}
		try{
			a = sc.nextInt();
			if(a > 70) {
				throw new IntegerTooLarge();
			}else if(a < 10){
				throw new IntegerTooSmall();
			}else{
				System.out.println(a);
			}
		}catch(Exception e) {
		}


	}

}
