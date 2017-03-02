package math_1;
import java.util.*;
class Add_1
{ public voi add()
  {int a,b;
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter A");
   a=scan.nextInt();
   System.out.println("Enter B");
   b=scan.nextInt();
   int c=a+b;
   System.out.println("Value="+c);
  }
  public static void main(String args[])
  { Add_1 obj=new Add_1();
    obj.add();
  }
}
