import java.util.Scanner;

public class Factorial
{
   public static void main(String[] args)
   {
      int n, i, fact=1;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the n Value: ");
      n = s.nextInt();
      
      for(i=n; i>=1; i--)
      {
         fact = fact*i;
      }
      
      System.out.println(fact);
   }
}
