 import java.util.Scanner;
class Pratham6
{
 public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<5;i++)
    {
     a[i]=s.nextInt(); 
    }
    int b[]=new int[5];
     for(int i=0;i<5;i++)
    {
     b[i]=s.nextInt(); 
    }
  int c[]=new int [5];
  int d=0;
   for(int i=0;i<5;i++)
    {
      for(int j=0;j<5;j++)
        {
      if(a[i]==b[j])
       {
          c[d]=a[i];
          d++;
        
       }
        }
    }
    int z=0;
    for(int i=0;i<d;i++)
     {
       for(int j=i+1;j<d-1;j++)
         {
             if(c[i]==c[j])
              {
                  c[i]=-1;
              }
         }
     }
    for(int i=0;i<d;i++)
     {
       if(c[i]!=-1)
        {
         System.out.println(c[i]);
        }
     }
  } 
}