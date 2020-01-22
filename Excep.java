import java.util.Scanner;
class Test
{
  public static void validate()
  {
    Scanner s= new Scanner(System.in);
     System.out.println("enter account number,pin and amount");
     int acc = s.nextInt();
     int pin = s.nextInt();
     try
     {
     int amt = s.nextInt();
      }
      catch(Exception e)
      {System.out.println("Eneter amount as a number");}
  }
}
class Excep
{
  public static void main(String args[])
  {
     Test t=new Test();
     t.validate();
  }
}