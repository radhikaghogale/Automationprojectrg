package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException3 {
	

public static void main(String[] args) throws IOException
{
	
	FileInputStream fs = null;
	
	fs= new FileInputStream ("C:\\Users\\R820931\\Desktop\\new 1.txt");
	
	int k;
	
	while ((k = fs.read()) != -1)
	{
		System.out.println((char)k);
	}
fs.close();
} 
	
}

	
	