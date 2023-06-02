import java.io.*;
class Figure
{
	int l,w;
	Figure(int a,int b)
	{
		l=a;
		w=b;
	}
	void area()
	{
		System.out.println("Area of the Figure");
	}
}
class Triangle extends Figure
{
	Triangle(int g,int h)
	{
		super(g,h);
	}
	void area()
	{
		System.out.println("Area is "+(l*w)/2);
	}
}
class Rectangle extends Figure
{
	Rectangle(int k,int l)
	{
		super(k,l);
	}
	void area()
	{
		System.out.println("Area is "+l*w);
	}
}
class HierInheritwithSuper
{
	public static void main(String ar[])
	{
		Triangle obj1=new Triangle(10,20);
		Rectangle obj2=new Rectangle(20,20);
		obj1.area();
		obj2.area();
	}
}
