import java.util.*;
class Map1
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     Map<String,Integer>m1=new HashMap<String,Integer>();
     m1.put("a",91);
     m1.put("b",92);
     m1.put("c",93);
     m1.put("d",94);
     m1.put("e",95);
     m1.put("p",96);
     System.out.println(m1);
     System.out.println(m1.get("p"));
     System.out.println(m1.keySet());
     System.out.println(m1.entrySet());
     System.out.println(m1.remove("c"));
     m1.replace("e",100);
     System.out.println(m1);
     m1.clear();
     System.out.println(m1);
  }
}