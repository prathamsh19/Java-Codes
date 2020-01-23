import java.util.*;
class Stack1
{
  public static void main(String args[])
  {
     Stack <Integer> s1 = new Stack <Integer> ();
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     for(int i=0;i<n;i++)
     {
        int a=s.nextInt();
        s1.push(a);
     }
     System.out.println(s1);
     s1.pop();
     s1.peek();
     System.out.println(s1.empty());
     System.out.println(s1.search(96));
  }
}