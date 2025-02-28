public class const1
{
  public void const1()
  {
    System.out.println("constructer in java object orienterd programming language");
  }
  
  static void cons()
  {
    System.out.println("this is a constructer which is of static type calleed without requring an obj");
  }
  public static void main(String [] args)
  {
    const1 ob = new const1();
    ob.const1();
    cons();
  }
}