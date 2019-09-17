import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class Fin
{
	public static void main(String args[]) throws IOException
	{
	Scanner davidScanner = new Scanner(System.in);
	String FileText;
	String davidText;
	
	System.out.println("Input File Text");
	FileText = davidScanner.nextLine();
	System.out.println("Input File Name");
	davidText = davidScanner.nextLine();
	
	FileWriter davidFile = new FileWriter(davidText+".DN");
	davidFile.write(FileText);
	davidFile.close();
	}
	
}
