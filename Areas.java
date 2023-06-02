import java.io.*;
class Figure
{
	int length=10;
	int height=20;
	void area()
	{
		System.out.println("x");
	}
}
class Rectangle extends Figure
{
	void area()
	{
		System.out.println("Area of Rectangle:"+length*height);
	}
}
class Triangle extends Figure
{
     void area()
	{
	System.out.println("Area of Triangle:"+0.5*length*height);
	}
}
class Areas
{
	public static void main(String args[])
	{
		Rectangle R=new Rectangle();
		Triangle T=new Triangle();
		R.area();
		T.area();
}
}


