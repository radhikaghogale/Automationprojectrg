package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException1 {

	public static void main(String[] args) {
		
		
		FileInputStream fs = null;
		
		//fs = new FileInputStream ("C:\\Users\\R820931\\Desktop\\new 1");
		
		try
		{
			fs= new FileInputStream ("C:\\Users\\R820931\\Desktop\\new 1.txt");
		}
		
		catch (FileNotFoundException fnfe)
		
		{
			System.out.println("The Specified file is not" + "present at the given path");
		}
		
		int k;
		
		try {
			while ((k = fs.read()) != -1)
			{
				System.out.println((char)k);
			}
		fs.close();
		} 
		catch (IOException ioe) 
		{
			System.out.println("I/O Error Occurred" + ioe);
		}
	}
	

	
}
