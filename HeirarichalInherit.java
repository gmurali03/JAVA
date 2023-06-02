class Figure
{
	int length =20;
	int height=30;
	void area()
	{
		System.out.println("area");
	}
}
class Rectangle extends Figure
{
	void area()
	{
		System.out.println("area of rectangle:"+length*height);
	}
}
class Triangle extends Figure
{
	void area()
	{
		System.out.println("area of triangle:"+0.5*length*height);
	}
}
class HeirarichalInherit
{
	public static void main(String args[])
	{
		Rectangle R=new Rectangle();
		Triangle T=new Triangle();
		R.area();
		T.area();
	}
}
