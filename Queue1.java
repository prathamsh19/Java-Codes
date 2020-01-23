import java.util.*;
class Queue1
{
  public static void main(String args[])
  {
     Queue <Integer> q = new LinkedList <Integer> ();
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     for(int i=0;i<n;i++)
     {
        int a=s.nextInt();
        q.add(a);
     }
     System.out.println(q.peek());
     System.out.println(q.remove());
     System.out.println(q.poll());
     System.out.println(q);
     System.out.println(q.element());
     System.out.println(q.size());
  }
}