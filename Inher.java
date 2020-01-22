import java.util.Scanner;
class marks
{
 int a[]=new int[5];
 String str;
 int roll;
 void in() 
 {
    Scanner s=new Scanner(System.in);
    str=s.next();
    roll=s.nextInt();
    for(int i=0;i<5;i++)
    {a[i]=s.nextInt();}
 }
 void out()
 {
     System.out.println("Name = " + str);
     System.out.println("Roll no. = " + roll);
   for(int i=0;i<5;i++)
    {System.out.println(a[i]);}
 }
}
class Stu extends marks
{
   int tot=0;
   void outt()
   {
       for(int i=0;i<5;i++)
   {tot+=a[i];}
     System.out.println("Total = "+ tot);
   }
}
class Inher extends Stu
{
    public static void main(String args[])
    {
       Stu st = new Stu();
       st.in();
       st.out();
       st.outt();
    }
}