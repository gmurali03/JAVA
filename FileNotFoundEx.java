import java.io.*;
public class FileNotFoundEx
{
	public static void method() throws FileNotFoundException
	{
		FileReader file=new FileReader("C:\\");
		BufferedReader fileInput=new BufferedReader(file);
        throw new FileNotFoundException();
	}
    public static void main(String args[])
    {
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
