import java.util.*;
class Deque1
{
  public static void main(String args[])
  {
     Deque <Integer> q = new LinkedList <Integer> ();
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     for(int i=0;i<n;i++)
     {
        int a=s.nextInt();
        q.add(a);
     }
     q.addFirst(100);
     q.addLast(200);
     System.out.println(q.peek());
     System.out.println(q.peekFirst());
     System.out.println(q.peekLast());
     System.out.println(q.remove());
     System.out.println(q.removeFirst());
     System.out.println(q.removeLast());
     q.offer(1000);
     q.offerFirst(2000);
     q.offerLast(3000);
     q.push(5000);
     q.pop();
     System.out.println(q.poll());
     System.out.println(q.pollFirst());
     System.out.println(q.pollLast());
     System.out.println(q);
  }
}