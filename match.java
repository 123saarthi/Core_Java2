import java.util.*;
class Student
{
int i,c;
int a[]=new int[6];
String s[]=new String[6];
String n[]=new String[6];
void insert()
{

for(i=0;i<6;i++)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter The Rollno & Name");

n[i]=scan.nextLine();
s[i]=scan.nextLine();
a[i]=scan.nextInt();
}

}
void display(int i)
{
System.out.println("Roll No"+a[i]);
System.out.println("Name"+n[i]);
System.out.println("Address"+s[i]);
}
}

class match
{ 
	public static void main(String args[])
  { 
	Student obj=new Student();
        obj.insert();
	int p;
	String m;
	Scanner s =new Scanner(System.in);
	m= s.nextLine();
	p= s.nextInt();
         for(int i=0;i<6;i++)
	{
	if(p==obj.a[i] && m.equals(obj.n[i]))
	{
	obj.display(i);
	}
	}
}
}
	