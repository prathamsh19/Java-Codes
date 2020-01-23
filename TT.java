class A extends Thread
{
 public void run()
 {
   int i;
   for(i=0;i<10;i++)
   {
     System.out.println(i + "Thread A");
     System.out.println("ThreadName"+Thread.currentThread().getName());
   }
 }
}
class B extends Thread
{
 public void run()
 {
   int i;
   for(i=0;i<10;i++)
   {
     System.out.println(i + "Thread B");
     System.out.println("ThreadName"+Thread.currentThread().getName());
   }
 }
}
class TT
{
 public static void main(String args[])
 {
    B a2=new B();
    A a1=new A();
    a1.start();
    a2.start();
 }
}