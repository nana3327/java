/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DevFast
 */

import java.util.*;	// For Scanner class
import java.io.*;		

public class vaorafile
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

}
