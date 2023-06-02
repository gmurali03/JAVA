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
		System.out.println(length*height);
	}
}
class Triangle extends Figure
{
     void area()
	{
	System.out.println(0.5*length*height);
	}
}
class Arearectri
{
	public static void main(String args[])
	{
		Rectangle R=new Rectangle();
		Triangle T=new Triangle();
		R.area();
		T.area();
}
}


