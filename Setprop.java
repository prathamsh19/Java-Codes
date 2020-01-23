import java.util.*;
class Setprop
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    Set <Integer> s1 = new HashSet <Integer> ();
    Set <Integer> s2 = new HashSet <Integer> ();
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
       int a=s.nextInt();
       s1.add(a);
    }
    for(int i=0;i<n;i++)
    {
       int a=s.nextInt();
       s2.add(a);
    }
    System.out.println(s1);
    System.out.println(s2);
     s1.addAll(s2);
    System.out.println(s1);
     s1.retainAll(s2);
    System.out.println(s1);
      s1.removeAll(s2);
    System.out.println(s1);     
  }
}