class A extends Thread
{
 public void run()
 {
   int i;
   for(i=0;i<10;i++)
   {
     try
     {
        Thread.sleep(1000);
     }
     catch(Exception e)
     {
        
     }
     System.out.println("ThreadName"+Thread.currentThread().getName());
   }
 }
}
class TT1
{
 public static void main(String args[])
 {
    A a1=new A();
     A a2=new A();
    A a3=new A();
    a1.start();
    try
    {
      a1.join();
    }
    catch(Exception e)
    {}
    a2.start();
    a3.start();
 }
}