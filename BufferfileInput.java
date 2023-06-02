import java.io.*;
class BufferfileInput
{
public static void main(String args[])
{
try
{
	FileInputStream fis=new FileInputStream("in.txt");
	BufferedInputStream bis= new BufferedInputStream(fis);
	int i=0;    
      while((i=bis.read())!=-1)
	{    
             System.out.print(i);    
      }    
	fis.close();
	bis.close();

}

catch(IOException e)
{
System.out.println(e);
}    
}    
}
