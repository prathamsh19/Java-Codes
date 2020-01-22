import java.util.Scanner;
class Main
{
    public static void main(String args[])
   {
       Scanner se = new Scanner(System.in);
       int n = se.nextInt();
       String s = se.next();
       if(n==1&&s.equals("january"))
       System.out.println("holiday");
       else if(n==25&&s.equals("december"))
        System.out.println("holiday");
       else if(n==1&&s.equals("july"))
        System.out.println("holiday");
        else
         System.out.println("no holiday");
   }
}