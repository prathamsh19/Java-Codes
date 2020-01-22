import java.util.Scanner;
class Operators
{
 public static void main(String args[])
  {
    Scanner p=new Scanner(System.in);
    int a=p.nextInt();
    int b=p.nextInt();
     System.out.println(a++);
     System.out.println(b--);
     System.out.println(--a);
     System.out.println(++b);
     System.out.println(a+b);
     System.out.println(a-b);
     System.out.println(a*b);
     System.out.println(a/b);
     System.out.println(a%b);
     if(a==0&&b==0)
      {System.out.println("equal");}
      else
       {System.out.println("not");}
      if(a<b)
       { System.out.println("a small");}
      else
       { System.out.println("a greater");}
       System.out.println(a+=b);
  }
}