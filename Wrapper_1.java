
public class Wrapper_1 
{ public static void main(String args[])
	{
	  int a=2;
	  Integer i=Integer.valueOf(a);//converting int into Integer  
	  Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
	  System.out.println(a+""+i+""+j);
	}

}
