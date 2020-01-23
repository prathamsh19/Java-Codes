class Stringmethods
{
   public static void main(String args[])
   {
        StringBuilder sb = new StringBuilder();
        sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String s="123";
        System.out.println(sb);
         System.out.println(sb.capacity());
         System.out.println(sb.charAt(15));
         System.out.println(sb.delete(3,9));
         System.out.println(sb.capacity());
          System.out.println(sb.replace(1,6 ,s));
         System.out.println(sb.replace(0,1,s));
         System.out.println(sb.capacity());
         System.out.println(sb.reverse());
         System.out.println(sb.indexOf("S"));
        System.out.println(sb.length());
       System.out.println(sb.toString());
   }
}