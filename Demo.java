import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   {
      try
      {
       String s="";
       System.out.println(s.length());
        int a=10;
        System.out.println(a/1);
        int ar[]=new int [2];
        System.out.println(ar[-1]);
      }
      catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e)
      {System.out.println("1");} 
      /*catch(Exception z)
      {
         System.out.println("wjp");
      }*/
      try
      {
         int az[]=new  int[5];
         System.out.println(az[5]);
      }
      catch(Exception e)
      {
          System.out.println("catch2");
      }
       System.out.println("catch1");
   }
}