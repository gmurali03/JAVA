import java.util.Scanner;
class Exceptionn
{
	public static void main(String args[])
	{
		int a=5,b=0;
		try
		{
			int c=5/0;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
							
