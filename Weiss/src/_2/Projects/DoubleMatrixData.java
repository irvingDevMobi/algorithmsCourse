package _2.Projects;

import _2.Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class DoubleMatrixData {

	public static void main(String [] args)
	{
		try {
			int size = -1;
			Scanner scanner = new Scanner(new FileReader("_2\\Projects\\double2.txt"));
			List<double[]> listMatrix = new ArrayList<>();
			while(scanner.hasNext())
			{
				String line = scanner.nextLine();
				// get size of matrix
				if (size < 0) 
				{
					size = line.split(" ").length; 
				}
				double [] array = new double[size];
				Scanner scannerLine = new Scanner(line);
				for (int i = 0; i < size; i++)
				{
					if (scannerLine.hasNextDouble()) 
					{
						array[i] = scannerLine.nextDouble();
					} else {
						throw new NoSuchElementException("The matrix is not rectangle");
					}
				}
				listMatrix.add(array);
			}
			double [][] matrix = new double[listMatrix.size()][size];
			for (int i = 0; i < listMatrix.size(); i++)
			{
				matrix[i] = listMatrix.get(i);
			}
			System.out.println("Sum: \t" + Practice.sum(matrix));
			System.out.println("Average: \t" + Practice.average(matrix));
			System.out.println("Mode: \t" + Practice.mode(matrix));
		} catch(FileNotFoundException | NoSuchElementException ex )
		{
			System.out.println("Error: " + ex.getMessage());
		}
	}
}