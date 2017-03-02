import java.math_1.*;
import java.util.*;
class AddTwoNum
{ public static void main(String args[])
  { int a,b;
    Add_1 in=new Add_1();
    System.out.println("Enter A");
    a=in.nextInt();
    System.out.println("Enter B");
    b=in.nextInt();
    int c=in.add(a,b);
    System.out.println("Result"+c);
  }
}