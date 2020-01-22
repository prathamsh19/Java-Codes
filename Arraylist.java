import java.util.*;
class Arraylist
{
  public static void main(String args[])
  {
      Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     ArrayList <Integer> a=new ArrayList<Integer>(n);
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
      System.out.println("enter index and value to update ");
      int p=s.nextInt();
      int q=s.nextInt();
      a.set(p,q);
      Iterator <Integer> it=a.iterator();
     while(it.hasNext())
     {System.out.println(it.next()+"      ");}
     Collections.sort(a);
     System.out.println(a);
     Collections.reverse(a);
     System.out.println(a);
     if(a.contains(50))
     System.out.println("yes");
     else
     System.out.println("no");
  }
}