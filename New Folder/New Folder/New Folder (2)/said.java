import java.util.Scanner;
public class said
{
  int x;
  public static void main(String [] args)
  {
    Scanner o = new Scanner(System.in);
    
    said ob = new said();
    
    System.out.println("enter your name ");
    String name = o.nextLine();
    System.out.println(name);
    ob.x = 23;
    System.out.println(ob.x);
  }
}