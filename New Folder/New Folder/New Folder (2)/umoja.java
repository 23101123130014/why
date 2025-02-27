import java.util.Scanner;
class umoja
{
  public static void main(String [] args)
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("hello enter your name");
    
    
    String user = ob.nextLine();
   
    
    
    System.out.println("enter your age: ");
    int age = ob.nextInt();
    
    
    System.out.println("enter your salary: ");
    double salary = ob.nextDouble();
    
    
     
      
       System.out.println("you name is: " + user);
        System.out.println("you age is: " + age);
        
        System.out.println("ÿou salary is " + salary);
  }
  
}
