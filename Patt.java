import java.util.Scanner;
class Patt
{
 public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   int n =s.nextInt();
   int flag = n;
   for(int i=0;i<n;i++)
     {
       for(int j=0;j<flag;j++)
         System.out.print(" ");
       
       for(int j=0;j<i;j++)
         System.out.print("* ");
       

      System.out.println();
      flag--;
     }
   
   flag=0;
   for(int i=n;i>0;i--)
     {
        for(int j=0;j<flag;j++)
         System.out.print(" ");
      
       for(int j=0;j<i;j++)
         System.out.print("* ");
       

      System.out.println();
      flag++; 
     }
 }  
}