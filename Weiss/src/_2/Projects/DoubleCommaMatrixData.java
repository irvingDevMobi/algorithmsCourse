package _2.Projects;

import _2.Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class DoubleCommaMatrixData {

	public static void main(String [] args) {
	
		try {
			Scanner scanner = new Scanner(new FileReader("_2\\Projects\\double3.txt"));
			if (scanner.hasNext()) 
			{
				String content = scanner.nextLine();
				String [] lines = content.split(",");
				int size = lines[0].split(" ").length;
				double [][] values = new double[lines.length][size];
				for (int i = 0; i < lines.length; i++)
				{
					String [] numbers = lines[i].split(" ");
					for (int j = 0; j < numbers.length; j++)
					{
						values[i][j] = Double.parseDouble(numbers[j]);
					}		
				}
				System.out.println("Sum: \t" + Practice.sum(values));
				System.out.println("Average: \t" + Practice.average(values));
				System.out.println("Mode: \t" + Practice.mode(values));
			}
		} catch(FileNotFoundException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}