import java.io.*;
class Linenum1
{
	public static void main(String args[])throws IOException
	{
	FileReader fin=new FileReader("file.java");
	int c,l=1;
	while((c=fin.read())!=-1)
	{
		if(l==1)
		{
			System.out.print(l+".");
			l++;
		}
		System.out.print((char)c);
		if(c=='\n')
		{
			System.out.print(l+"." );
			l++;
		}
	}
	fin.close();
	}
}
