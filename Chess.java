import java.util.Scanner;
class Chess
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      char b = s.next().charAt(0);
      if(a%2!=0 && ((b=='a') || (b=='c') || (b=='e') || (b=='g')) )
        {
            System.out.println("Black Square");
        }
      else if(a%2==0 && ((b=='b') || (b=='d') || (b=='f') || (b=='h')) )
        {
           System.out.println("Black Square");
        }
       else
         {
                System.out.println("White Square");
         }
  }
}