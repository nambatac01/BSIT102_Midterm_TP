import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fout
{
	public static void main(String args[]) throws IOException
	{
	System.out.print("Enter the file name with extension : ");
	Scanner davidInput = new Scanner(System.in);
	
	File davidFile = new File(davidInput.nextLine()+".DN");
	davidInput = new Scanner(davidFile);
	
	String davidLine = davidInput.nextLine();
	System.out.println(davidLine);
	
	davidInput.close();
	}
}

