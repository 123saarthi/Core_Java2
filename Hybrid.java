class Student
{ int rollnumber;
  void getnumber(int n)
  {
   rollnumber=n;
  }
  void putnumber()
  { System.out.println("Roll no:"+rollnumber);
  }
}
class Test extends Student
{ float part1, part2;
  void getmarks(float m1, float m2)
  { part1=m1;
    part2=m2;
  }
  void putmarks()
  { System.out.println("Marks obtained");
    System.out.println("Part1="+part1);
    System.out.println("Part2="+part2);
  }
}
interface Sports
{ float sportwt=6.0f;
  void putwt();
}
class Results extends Test implements Sports
{ float total;
  public void putwt()
  { System.out.println("Sports Wt="+sportwt);
  }
  void display()
  { total=part1+part2+sportwt;
    putnumber();
    putmarks();
    putwt();
    System.out.println("Total Score="+total);
  }
}
class Hybrid
{ public static void main(String args[])
  { Results student1=new Results();
    student1.getnumber(1234);
    student1.getmarks(27.5f,33.0f);
    student1.display();
  }
}
   
    
  
    