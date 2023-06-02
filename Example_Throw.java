import java.io.*;
class Example_Throw
{ 
	void testMethod(int num) throws IOException, ArithmeticException
	{ 
		if(num==1)
		{
			throw new IOException("IOException Occurred");
		}
		else
		{
			throw new ArithmeticException("ArithmeticException");
		} 
	}
}
class Main
{ 
	public static void main(String args[]) throws IOException, ArithmeticException
	{ 
		try
		{ 
			Example_Throw obj=new Example_Throw(); 
			obj.testMethod(0); 
		}
		catch( ArithmeticException ex)
		{
		System.out.println(ex);
		} 
	}
}
