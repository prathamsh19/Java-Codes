import java.util.*;
class Vector1
{
  public static void main(String args[])
  {
    Vector v = new Vector();
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=0;i<n;i++)
    {
      int a = s.nextInt();
      v.add(a);
    }
    v.add("Pratham");
    for(int i=0;i<=n;i++)
    {
      System.out.print(v.get(i)+" ");
    }
    v.set(n-1,"Sharma");
    System.out.println();
    v.add(1,96);
    System.out.println();
    v.remove(4);
    System.out.println();
    
    System.out.println(v.indexOf("Pratham"));
    //v.clear();
    System.out.println();
    System.out.println();
    System.out.println(v);
  }
}