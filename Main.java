import java.util.LinkedList;
import java.util.Queue;

public class stack
{
	Queue<Integer> q = new LinkedList<Integer>();
	
	// Push operation
	void push(int val)
	{
		int size = q.size();
		
		// Add current element
		q.add(val);
		
		
		for (int i = 0; i < size; i++)
		{
			int x = q.remove();
			q.add(x);
		}
	}
	
	int pop()
	{
		if (q.isEmpty())
		{
			System.out.println("No elements");
			return -1;
		}
		int x = q.remove();
		return x;
	}
	
	// Returns top of stack
	int top()
	{
		if (q.isEmpty())
			return -1;
		return q.peek();
	}
	
	// Returns true if Stack is empty else false
	boolean isEmpty()
	{
		return q.isEmpty();
	}

	// Driver program to test above methods
	public static void main(String[] args)
	{
		stack s = new stack();
		s.push(10);
		s.push(20);
		System.out.println("Top element :" + s.top());
		s.pop();
		s.push(30);
		s.pop();
		System.out.println("Top element :" + s.top());
	}
}
 


file split

import java.io.*; 
import java.util.Scanner; 
public class Main { 
	public static void main(String args[]) { 
		try{ 
			
			// Reading file and getting no. of files to be generated 
			String inputfile = "test.txt"; //  Source File Name. 
			// No. of lines to be split and saved in each output file.
			double nol = 5.0;			
			File file = new File(inputfile); 
			Scanner scanner = new Scanner(file); 
			int count = 0; 
			while (scanner.hasNextLine())
			{ 
				scanner.nextLine(); 
				count++; 
			} 

			// Displays no. of lines in the input file.
			System.out.println("Lines in the file: " + count);							
			double temp = (count/nol); 
			int temp1=(int)temp; 
			int nof=0; 
			if(temp1==temp) 
			{ 
				nof=temp1; 
			} 
			else 
			{ 
				nof=temp1+1; 
			} 
			System.out.println("No. of files to be generated :"+nof); 
			
			// Actual splitting of file into smaller files 
			
			BufferedReader br = new BufferedReader(new FileReader(inputfile)); 
			String strLine; 
			
			for (int j=1;j<=nof;j++) 
			{ 
				// Destination File Location 
				FileWriter fw= new FileWriter("File"+j+".txt");     
				for (int i=1;i<=nol;i++) 
				{ 
					strLine = br.readLine(); 
					if (strLine!= null) 
					{
						strLine=strLine+"\r\n";
						fw.write(strLine);  
					} 
				} 
				fw.close(); 
			} 
			br.close(); 
		}
		catch (Exception e)  { 
			System.err.println("Error: " + e.getMessage()); 
		} 
	} 
}  


