import java.io.*;
import java.text.SimpleDateFormat;
class Fileprop
{
	public static void main(String...arg)
	{
		File f=new File("test.txt");
		if(f.exists())
		{
			System.out.println("Readable :"+f.canRead());
			System.out.println("Writable :"+f.canWrite());
			System.out.println("Length :"+f.length());
			System.out.println("Last modified in before format:"+f.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("After Format : " + sdf.format(f.lastModified()));
		}
		else
		System.out.println("not exist");
	}
}
