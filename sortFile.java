/*
@Title: Question 2c
@Purpose: this programs takes input from file reveresed, sorted them and output to console.
@Author: Parameshor Bhandari
@Date:Sep 30, 2014
*/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortFile
{
	public static void main (String[] args) throws IOException
	{
		String reverse = "";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the input file: ");
		String filename1 = keyboard.nextLine();

		File file = new File(filename1);
		Scanner inputFile = new Scanner(file);

		while(inputFile.hasNext()) //read the file
		{
			String line = inputFile.nextLine();
			int length = line.length();

			for ( int i = length - 1 ; i >= 0 ; i-- )
			{
			    reverse = reverse + line.charAt(i);
			}
			String [] splittedString  = reverse.split(" ");
			List<String> wordList = Arrays.asList(splittedString);
			Collections.sort(wordList);
			System.out.println(wordList);
		}
		inputFile.close();
	}
}
/*Enter the input file: output.txt
[hari, pramesh, sita]
Press any key to continue . . .
*/