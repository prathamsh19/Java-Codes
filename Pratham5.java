import java.util.Scanner;
class Pratham5
{
  public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int a[]=new int[5];
      for(int i=0;i<5;i++)
        {
          a[i]=s.nextInt();
        }
      int b=s.nextInt();
      int c;
      for(int i=0;i<5;i++)
        {
          if(a[i]==b)
           {
               System.out.println(i);
           }
        }
       for(int i=0;i<5;i++)
        {
          for(int j=0;j<4;j++)
            {
               if(a[i]>a[j])
                {
                    int t;
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
          for(int i=0;i<5;i++)
        {
          System.out.println(a[i]);
        }
        int k=s.nextInt();
       for(int i=0;i<k;i++)
        {
         int p=a[0];
          for(int q=0;q<4;q++)
        {
          a[q]=a[q+1];
        }
          a[4]=p;
       }
       for(int i=0;i<5;i++)
        {
          System.out.println(a[i]);
        }
   }
}