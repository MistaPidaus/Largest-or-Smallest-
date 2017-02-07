/* 	
	Coded by Mista Pidaus
  Copyright 2017
*/ 
import java.util.*;
import java.util.Scanner;
import java.io.*;
	//Declare a class
	public class Determine {
		
		public static void main (String args[]) throws IOException
		{
			int i, max, min, j;
			int[] numbers = new int[500]; //declare an array to store data
			for (j = 1; j < 6; j++) //This will loop for 5 times
			{
			System.out.print("\nEnter your name: "); //Instruction for User
			// Get the input stream representing standard input
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); //User will input string name
			String str;
			str = stdin.readLine(); //System will read what users input
			System.out.println(str + ", Please enter 4 numbers\n"); //Instruction for user
			for (i=1; i<5; i++) //Loop for 4 times
			{
				System.out.print("Number " + i);
				System.out.print(": ");
				Scanner number = new Scanner(System.in); //Requires user to input int number
				numbers[i] = number.nextInt(); //Stores data in array
			}	
				max = min = numbers[1]; //Where the data stores in arrays
				
				for(i = 1; i < 5; i++) 
				{//The process of determine which Largest and Smallest Number Starts Here
					if(numbers[i] > max) 
					max = numbers[i];
					else if (numbers[i] < min)
					min = numbers[i];
				}
				//Display the Output
			System.out.println("\nLargest = " + max);
			System.out.println("Smallest = " + min);
			
			}

			
			
		}
	}
