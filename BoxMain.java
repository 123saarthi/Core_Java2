import java.util.*;
public class BoxMain 
{
  public static void main(String args[])
  { double w,d,h;
    Box ob1=new Box();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter wid");
    w=in.nextFloat();
    System.out.println("Enter depth");
    d=in.nextFloat();
    System.out.println("Enter height");
    h=in.nextFloat();
    ob1.setWidth(w);
    ob1.setDepth(d);
    ob1.setHeight(h);
    System.out.println("Width value="+ob1.getWidth());
    System.out.println("Height value="+ob1.getHeight());
    System.out.println("Depth value="+ob1.getDepth());
    double vol;
    vol=ob1.vol();
    System.out.println("Vol="+vol);
    
  }
  
}
