import java.io.*;
class Frequency{
	public static void main(String[ ] args) throws IOException{
		FileInputStream fis=new FileInputStream("in.txt");
		BufferedInputStream bin=new BufferedInputStream(fis);
		
		int i=0,d=0,v=0,s=0,c=0,sp = 0;
		while((i=bin.read())!=-1){    
			char ch=(char)i;
			if(((ch>='a') && (ch<='z')) || ((ch>='A') && (ch<='Z')))
			{
				if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
					v++;
				else if(ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U')
					v++;
				else
					c++;
			}
			else if(ch>='0' && ch<='9')
               		 d++;
			else if (ch==' ')
			    sp++;
			     
			    
			else
				s++;
	    	}
fis.close();
bin.close();
		System.out.println("Digits "+d);
		System.out.println("Vowels "+v);
		System.out.println("Consonants "+c);
		System.out.println("Special Characters "+s);
	}
}
   
