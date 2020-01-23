class ThreadDemo implements Runnable
{
  public void run()
{
  for(int i=0;i<10;i++)
  {
    Thread.sleep(100);
  System.out.println("in thread");
    System.out.println("ThreadName"+Thread.currentThread().getName());
   }
}
}
class TT2
{
  public static void main(String args[])
  {
      Thread t1=new Thread(new ThreadDemo());
      Thread t2=new Thread(new ThreadDemo());
      Thread t3=new Thread(new ThreadDemo());
       t1.start();
       try
       {
          t1.join();
       }
       catch(Exception e)
       {}
       t2.start();
       t3.start();
  }
}