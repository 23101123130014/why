public class cal
{
  static int sum(int x, int y)
  {
    System.out.println("sum is ");
    return x + y;
  }
  static double sum(double x, double y)
  {
    return x + y;
  }
  
  static void add()
  {
    System.out.println("hell");
  }
  public static void main(String [] args)
  {
    int result = sum(3, 6);
    System.out.println(result);
    
    double result2 = sum(3.2, 4.5);
    System.out.println(result2);
  }
}