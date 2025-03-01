//let we learn about public and private method
public class mahindi
{
static void huru()
{
  System.out.println("it is free to use  this method without creating an object of the class");
}

public void fungwa()
{
  System.out.println("it is only called by creating the object of the class");
}

public static void main(String [] args)
{
  mahindi ob = new mahindi();
  huru();
  ob.fungwa();
}
}
  