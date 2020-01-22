import java.util.Scanner;
interface One
{
  final int i = 10;
  void display();
}
class Square implements One
{
   public void display()
   {
    System.out.println("Square " + i*i);
   }
}
class Rec implements One
{
   int b;
   public void display()
   {
      Scanner s= new  Scanner(System.in);
      b= s.nextInt();
    System.out.println("rec"+ i*b);
   }
}
class AREA 
{
  public static void main(String args[])
  {
     Square d = new Square();
     Rec r = new Rec();
     d.display();
     r.display();
  }
}