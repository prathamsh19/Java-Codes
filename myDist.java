import java.util.Scanner;
class Dist
{
  int km,m;
  void set()
  {Scanner s = new Scanner(System.in);
   km=s.nextInt();
   m=s.nextInt();}
  void add(Dist d)
  {
   int p,r;
   km=km*1000+m;
   d.km=d.km*1000+d.m;
   km+=d.km;
   p=km/1000;
   r=km%1000;
   System.out.println("add=" +p+ "kms" +r+ "ms");
  }
  void sub(Dist d)
  {
    int a,b;
    a=km*1000+m;
    b=d.km*1000+d.m;
    if(a>b)
     {
        int x;
         x=a-b;
        int y,z;
         y=x/1000;
         z=x%1000;
         System.out.println("sub=" +y+ "kms" +z+ "ms");
     }
    else
     {
         int x;
         x=b-a;
        int y,z;
         y=x/1000;
         z=x%1000;
         System.out.println("sub=" +y+ "kms" +z+ "ms");
     }
  }
}
class myDist
{
  public static void main(String args[])
  {
      Dist t = new Dist();
      Dist q = new Dist();
      q.set();
      t.set();
      q.add(t);
      q.sub(t);
  }
}













































































import java.util.Scanner;
class Dist
{
 int km,m;
 void setvalue()
 {Scanner s = new Scanner(System.in);
  km=s.nextInt();
  m=s.nextInt();}
 void add(Dist d)
 {
  int p,r;
  km=km*1000+m;
  d.km=d.km*1000+d.m;
  km+=d.km;
  p=(km / 1000);
  r=km % 1000;
  System.out.println("add= "+p+" km "+r+"m");
  }
}
class myDist
{
  public static void main(String args[])
  {
       Dist a = new Dist();
       Dist b = new Dist();
       a.setvalue();
       b.setvalue();
       a.add(b);
  }
}