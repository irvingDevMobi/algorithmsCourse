import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exercise 2.28
 **/
 public class FileAnalizer {
	
	public static void main(String [] args)
	{
		for (String file : args)
		{
			try 
			{
				countElements(file);
			} catch(IOException ex) 
			{
				System.out.println("Error with file: " + file);
			}
		}
	}
	
	public static void countElements(String filePath) throws IOException
	{
		int lines = 0;
		int words = 0;
		int characters = 0;
		
		Scanner fileIn = new Scanner(new FileReader(filePath));
		while(fileIn.hasNextLine())
		{
			String line = fileIn.nextLine();
			lines++;
			Scanner scanLine = new Scanner(line);
			while(scanLine.hasNext()) 
			{
				String word = scanLine.next();
				words++;
				System.out.println(word.length() + " " + word);
				characters += word.length();		
			}
			
		}
		System.out.println("Lines: " + lines);
		System.out.println("Words: " + words);
		System.out.println("characters: " + characters);
		
	}
}