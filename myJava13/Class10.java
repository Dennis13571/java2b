package myJava13;

class RadiusTooLarge extends Exception{
}
class RadiusIsNegative extends Exception{
}

class CCircle{
   private double radius;
   public void setRadius(double r) throws RadiusTooLarge, RadiusIsNegative{
      if(r<0){
    	  throw new RadiusIsNegative();
      }else if(r>100){
    	  throw new RadiusTooLarge();
      }
      else
         radius=r;
   }

   public void show(){
      System.out.println("area="+3.14*radius*radius);
   }
}

public class Class10{
   public static void main(String args[]){
      CCircle cir=new CCircle();
      try{
    	  cir.setRadius(1000.0);
    	  cir.setRadius(-2.0);
      }
      catch(Exception e){
         System.out.println(e+" throwed");
      }
      cir.show();
   }
}