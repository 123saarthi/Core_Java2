
public class Wrapper2 
{ public static void main(String args[])
	{
	 Integer i=new Integer(3);
	 int a=i.intValue();//converting Integer to int  
	 int j=a;//unboxing, now compiler will write a.intValue() internally    
	 System.out.println(a+" "+i+" "+j);
	 
	}

}
