import java.io.*;
class fileOutput
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("in.txt");
			String s ="Hello Welcome";
			byte[] b=s.getBytes();
			fos.write(b);
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
