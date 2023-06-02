import java.util.Scanner;
class Fibo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nth term");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.println("Fibonacci series");
		for(int i=1;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println("nth term:"+c);
	}
}
