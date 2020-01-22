class GenDemo<T>
{
  T obj;
  GenDemo(T obj)
  {
     this.obj=obj;
  }
  void print()
  {
    System.out.println(this.obj);
  }
}
class Generic
{
   public static void main(String args[])
   {
     GenDemo <Integer> g1=new GenDemo<Integer>(96);
     g1.print();
      GenDemo <String> g2=new GenDemo<String>("96");
     g2.print();
   }
}