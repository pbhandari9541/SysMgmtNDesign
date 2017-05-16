/*
@Question#1
@Purpose: this program takes input from the file and output to the console
@Author: Pramesh Bhandari
@Date:Feb 9, 2015
*/

import java.util.Scanner;
import java.io.*;

public class inputOutput
{
	public static void main(String[] args)throws IOException
	{
		//create a Scanner Object for keyboard input

		Scanner keyboard = new Scanner(System.in);

		//get the filename
		System.out.print("Enter the name of the file: ");
		String filename = keyboard.nextLine();

		//open the file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);



		while(inputFile.hasNext()) //read the file
		{
			String line = inputFile.nextLine();
			System.out.println(line);
		}
		//close the file
		inputFile.close();
	}
}
