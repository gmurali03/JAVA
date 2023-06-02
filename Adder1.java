class MethodOverloading
{
	 void display(int a)
	 {
		 System.out.println("Arguments:"+a);
	 }
	 void show(int a,int b)
	 {
		System.out.println("Arguments:"+a+"and"+b);
	 }
	 public static void main(String args[])
	 {
		 display(15);
		 display(15,9);
	 }
 }
	
