class Stringbuilderconstruct
{
  public static void main(String args[])
  {
      String s = "abcd";
      StringBuilder sb = new StringBuilder();
      sb.append("efgh");
      System.out.println(sb);
      System.out.println(s);
      StringBuilder sbs = new StringBuilder (20);
      sbs.append("ijkl");
      System.out.println(sbs);
      StringBuilder sbss = new StringBuilder("mno");
      sbss.append("pqr");
      System.out.println(sbss);
      StringBuilder sbsss = new StringBuilder(s);
      sbsss.append("stu");
      System.out.println(sbsss);  
  }
}