import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Practice {
	
	public static void main(String ... args) 
	{
		String [] strings =
		{
			"subfijo", "prefijo", "preffix", "suffix", "fix", "ffix", "xfix"
		};
		int post = 4;
		int word = 2;
		if (isPostfixOf(strings[post], strings[word]))
		{
			System.out.println(strings[post] + " is postfix of " + strings[word]);
		} else {
			System.out.println(strings[post] + " is NOT postfix of " + strings[word]);
		}
		
		int [] five = { 1, 2, 3, 4, 5};
		System.out.println("Size:" + five.length);
		five = resize(five);
		System.out.println("Size:" + five.length);
		
		if (args.length > 1)
		{
			if (areEquals(args[0], args[1]))
			{
				System.out.println("They are same");
			} else
			{
				System.out.println("They are different");
			}
		}
		double [] array = { 6, 8, 8, 9, 7, 7, 7, 10, 7, 8};
		System.out.println("Sum: \t" + sum(array));
		System.out.println("Average: \t" + average(array));
		System.out.println("Mode: \t" + mode(array));
	}
	
	public static boolean isPostfixOf(String str1, String str2)
	{
		int diff = str2.length() - str1.length();
		if (diff >= 0) 
		{
			for (int i = str1.length() - 1; i >= 0; i--)
			{
				if (str1.charAt(i) != str2.charAt(i + diff)) 
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static int [] resize(int [] array) 
	{
		int [] newArray = new int[array.length * 2 + 1];
		for (int i = 0; i < array.length; i++)
		{
			newArray[i] = array[i];
		}
		return newArray;
	}

	public static boolean areEquals(String file1, String file2)	
	{
		try {
			return sumCharactersFile(file1) == sumCharactersFile(file2);
		} catch(FileNotFoundException e)
		{
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	private static int sumCharactersFile(String pathFile) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new FileReader(pathFile));
		int sum = 0;
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine(); 
			for (int c = 0; c < line.length(); c++)
			{
				sum += line.charAt(c);
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	public static double sum(double [] array)
	{
		double sum = 0;
		for(double d : array)
		{
			sum +=  d;
		}
		return sum;
	}
	
	public static double average(double [] array)
	{
		return sum(array)/array.length;
	}
	
	public static double mode(double [] array)
	{
		HashMap<Double, Integer> map = new HashMap<>();
		map.put(array[0], 1);
		for (int i = 1; i < array.length; i++)
		{
			if (map.containsKey(array[i])) 
			{
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		
		int max = 0;
		double mode = array[0];
		
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Double, Integer> pair = (Map.Entry) iterator.next();
			if (pair.getValue() > max)
			{
				max = pair.getValue();
				mode = pair.getKey();
			}
		}
		return mode;	
	}
}