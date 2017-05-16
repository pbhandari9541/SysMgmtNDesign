/*
@Question#2b
@Purpose:this program takes input from file1 and output to file 2 in reversed order
@Author: Parameshor Bhandari
@Date:Feb 9, 2015
*/
import java.util.Scanner;
import java.io.*;

public class file1Tofile2
{
	public static void main (String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the input file: ");
		String filename1 = keyboard.nextLine();

		File file = new File(filename1);
		Scanner inputFile = new Scanner(file);

		System.out.print("Enter the output file: ");
		String filename2 = keyboard.nextLine();
		PrintWriter outputFile = new PrintWriter(filename2);

		while(inputFile.hasNext()) //read the file
		{
			String line = inputFile.nextLine();
			int length = line.length();

			for ( int i = length - 1 ; i >= 0 ; i-- )
			{
				String reverse = "";
			    reverse = reverse + line.charAt(i);
			    outputFile.print(reverse);
	 		}
		}

		//close the file
		inputFile.close();
		outputFile.close();



	}

}