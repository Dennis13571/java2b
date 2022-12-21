package myJava13;

class NotTriangle extends Exception{
}
class EquilateralTriangle extends Exception{
}
class NotquilateralTriangle extends Exception{
}

public class Class12 {
	static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotquilateralTriangle{
		if((a+b)<c || (a+c)<b || (b+c)<a) {
			throw new NotTriangle();
		}else if(a==b && a==c && b==c) {
			throw new EquilateralTriangle();
		}else{
			throw new NotquilateralTriangle();
		}
	}
	public static void main(String[] args) {
		int a=3;
		int b=3;
		int c=3;
		try{
			triangle(a,b,c);
		}catch(Exception e) {
			System.out.println(e);
		}


	}

}
