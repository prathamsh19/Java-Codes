class Threadp extends Thread
{
  public void run()
  {
       System.out.println(".....");
  }
}
class Threadpriority
{
   public static void main(String args[])
   {
     Threadp A=new Threadp();
     Threadp B=new Threadp();
     System.out.println(A.getPriority());
     System.out.println(B.getPriority());
     A.setPriority(9);
     B.setPriority(6);
     System.out.println(A.getPriority());
     System.out.println(B.getPriority());
   }
}