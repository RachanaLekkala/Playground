class MyModel1 {
     //write your logic here
   int cam=2;
  String lock="No lock";
  int dis=5 ;
  
}
class MyModel2 extends MyModel1 {
     //write your logic here
   int cam=5 ;
  String lock="Fingerprint";
  
}
class MyModel2T extends MyModel2 {
     //write your logic here
   int cam=16 ;
  int dis=6 ;
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel1 m1=new MyModel1();
      MyModel2 m2=new MyModel2();
      MyModel2T m3=new MyModel2T();
      System.out.println("Features of MyModel 1");
      System.out.println("Camera mega pixels: "+m1.cam);
      System.out.println("Features of MyModel 2");
      System.out.println("Camera mega pixels: "+m2.cam);
      System.out.println("Lock mechanism: "+m2.lock);
      System.out.println("Display size: "+m2.dis);
      System.out.println("Features of MyModel 2T");
      System.out.println("Camera mega pixels: "+m3.cam);
      System.out.println("Lock mechanism: "+m3.lock);
      System.out.println("Display size: "+m3.dis);
    }
}