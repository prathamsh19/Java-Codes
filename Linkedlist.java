import java.util.*;
class Linkedlist
{
  public static void main(String args[])
  {
      Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     LinkedList <Integer> a=new LinkedList<Integer>();
     for(int i=0;i<n;i++)
     {
         int a1=s.nextInt();
         a.add(a1);
     }
     System.out.println(a);
     System.out.println("element to remove");
     int r=s.nextInt();
     a.remove(r);
     System.out.println(a);
     for(int i=0;i<a.size();i++)
     {
       System.out.println(a.get(i)+" ");
     }
  }
}