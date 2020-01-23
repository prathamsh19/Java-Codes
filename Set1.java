import java.util.*;
class Set1
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    Set <Integer> s1 = new HashSet <Integer> ();
    Set <Integer> s2 = new TreeSet <Integer> ();
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
       int a=s.nextInt();
       s1.add(a);
       s2.add(a);
    }
    System.out.println(s1);
    System.out.println(s2);
  }
}