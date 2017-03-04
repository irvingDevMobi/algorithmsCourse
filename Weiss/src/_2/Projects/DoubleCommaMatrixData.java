package _2.Projects;

import _2.Practice;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class DoubleCommaMatrixData {

	public static void main(String [] args) {
	
		try {
			Scanner scanner = new Scanner(new FileReader("\\2_\\Projects\\double3.txt"));
			if (scanner.hasNext()) 
			{
				String [] vectors = scanner.next().split(",");
			}
		} catch(FileNotFoundException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}