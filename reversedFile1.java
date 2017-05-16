/*
@Question#2a
@Purpose:  this program takes input from the keyboard and output to the file1 in reversed order
@Author: Parameshor Bhandari
@Date:Feb 9, 2015
*/
import java.util.Scanner;
import java.io.*;
public class reversedFile1
{
	public static void main(String[] args)throws IOException
	{
		//create a Scanner Object for keyboard input

		Scanner keyboard = new Scanner(System.in);

		//get the filename to write
		System.out.print("Enter the file name to write: ");
		String filename = keyboard.nextLine();

		//open the file
		PrintWriter outputFile = new PrintWriter(filename);
		//get the series of name
		System.out.print("Enter the series of name: ");
		String name = keyboard.nextLine();
		int length = name.length();

		 for ( int i = length - 1 ; i >= 0 ; i-- )
		 {
			String reverse = "";
         	reverse = reverse + name.charAt(i);

         	outputFile.print(reverse);
	 	}


		//close the file
		outputFile.close();
	}
}

