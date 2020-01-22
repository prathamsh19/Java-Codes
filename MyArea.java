import java.util.Scanner;
class Area
{
   int a,b,c;
   void set(int x)
   {
    a=x;
    System.out.println("area of sq. = "+(a*a)); 
   }
   void set(int x,int y)
   {
      b=x;
      c=y;
      System.out.println("area of rec. = "+(b*c)); 
   }
}
class MyArea
{
  public static void main(String args[])
  {
     Area p=new Area();
     Scanner s = new Scanner(System.in);
     int v,t,u;
     v=s.nextInt();
      u=s.nextInt();
      t=s.nextInt();
     p.set(v);
     p.set(u,t);
  }
}