//Tristan Struthers | McGill University
//9.21.2014
//Written for the 9th Problem on projecteuler.net

public class problem9
{
  public static void main(String[] args)
  {
    double c;
    int cAsInt;
    
    
    for (int a = 1; a <=500; a++)
    {
      for (int b = a+1; b <= 500; b++)
      {
        c = Math.sqrt((a*a) + (b*b));
        cAsInt = (int)c;
        
        if(c - cAsInt == 0 && a+b+c == 1000)
        {
          System.out.println("The desired pythagorean triplet is: " + a + "," + b + "," + cAsInt);
          System.out.println("The product abc is " + a*b*cAsInt);
          System.out.println(cAsInt);
        }
        
        else
        {
          continue;
        }
        
      }
    }
  }
}