import java.util.Scanner;
class Pratham1D
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int p,q,n,c=0,h=0;
 n=s.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 a[i]=s.nextInt();
 for(int i=0;i<n;i++) 
 {
  if(a[i]>h)
  h=a[i];
 }
 p=h;
 q=h;
 for(int i=0;i<n;i++)
 {
  if(a[i]<p)
  {
  p=a[i];
  c=i;
  }
 }
 a[c]=h;
 for(int i=0;i<n;i++)
 {
  if(a[i]<q)
  {
  q=a[i];
  }
 }
 System.out.println(p);
 System.out.println(q);
}
}