import java.util.*;	// For Scanner class
import java.io.*;		

public class FileProcessor
{
	public static void main(String [] args) 
	{
			try {
				File inputFile = new File("student.txt");	
				Scanner input = new Scanner(inputFile);
				PrintWriter pw = new PrintWriter(new File(“quoted.txt”));
		
				while(input.hasNextLine()) {
					pw.println("> " + input.nextLine());
				}
			}
			catch(FileNotFoundException exception) {
				System.out.println("Could not find the input file.");
				System.out.println(exception.getLocalizedMessage());
				exception.printStackTrace();
			}
			catch(IOException exception) {
				System.out.println(“Could not write to file ‘quoted.txt’.”);
			}
	}
}
