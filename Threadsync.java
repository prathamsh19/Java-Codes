import java.util.Scanner;
class Account
{
  int bal;
  public Account(int m)
  {bal=m;}
  public boolean is_suff(int w)
  {
    if(bal>=w)
      return true;
    else
      return false;
  }
  void withdraw(int amt)
  {
    bal=bal-amt;
    System.out.println("Current Balance"+bal);
  }
}
class customer implements Runnable
{
  Account acc;
  String name;
  public customer(Account a,String n)
  {
    acc=a;
    name=n;
  }
  public void run()
  {
    synchronized(acc)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter amount to withdraw");
    int amt=s.nextInt();
    if(acc.is_suff(amt))
      acc.withdraw(amt);
    else
      System.out.println("Insufficient balance");
    }
  }
}
public class Threadsync
{
  public static void main(String args[])
  {
   Account a1=new Account(5000);
   customer c1=new customer(a1,"Ram");
   customer c2=new customer(a1,"Sham");
   Thread t1=new Thread(c1);
   Thread t2=new Thread(c2);
   t1.start();
   t2.start();
  }
}
