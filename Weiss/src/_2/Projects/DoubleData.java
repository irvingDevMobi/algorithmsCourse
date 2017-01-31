package _2.Projects;

import _2.Practice;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class DoubleData{
	
	public static void main(String [] args) 
	{
		try {
			Scanner scanner = new Scanner(new FileReader(".\\_2\\Projects\\double.txt"));
			ArrayList<Double> numbers = new ArrayList<>();
			while(scanner.hasNextDouble())
			{
				numbers.add(scanner.nextDouble());		
			}
			System.out.println("Numbers: " +  numbers.size());
			double [] array = new double[numbers.size()];
			for(int i = 0; i < array.length; i++)
			{
				array[i] = numbers.get(i);
			}
			System.out.println("Sum: " + Practice.sum(array));
			System.out.println("Average: " + Practice.average(array));
			System.out.println("Mode: " + Practice.mode(array));
		} catch(FileNotFoundException ex) 
		{
			System.out.println("" + ex.getMessage());
		}
	}
	

}