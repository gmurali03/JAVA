import java.io.*;
class FileInput
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("in.txt");
			int i=0;    
			while((i=fis.read())!=-1)
			{    
				System.out.print(i);    
			}    	
			fis.close();
		}

		catch(IOException e)
		{
			System.out.println(e);
		}    
	}    
}
