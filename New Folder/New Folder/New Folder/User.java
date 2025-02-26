import java.util.Scanner;

class User
{
  public static void main(String [] args)
  {
    Scanner ob = new Scanner(System.in)
      String username;
    //enter user and press enter
    System.out.println("enter the user name");
   username = ob.nexLine();
   System.out.printline("username is: " + username);
  }
}