import java.util.ArrayList;
import java.util.Arrays;

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
		
		String [] numbers = { "1", "2", "3", "4", "5", "6", "7", "8"};
		println(numbers);
		reverse(numbers);
		println(numbers);
		
		ArrayList<String> numbersList = new ArrayList<String>(Arrays.asList(numbers));
		println(numbersList);
		reverse(numbersList);
		println(numbersList);
		
		int [] arrayInts = { 2 , 4 , 5, 0, 6, -4, 6, 7};
		int minArray = min(arrayInts);
		System.out.println("MIN: " + minArray);
		
		int [][] matrixInts = 
		{
			{2 , 4 , 5, 0}, 
			{6, -4, 6, 7},
			{2, -2, 0, 11},
			{-5, -4, 6, 1}
		};
		int minMatrix = min(matrixInts);
		System.out.println("MIN: " + minMatrix);
		
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
	
	public static void reverse(String [] array)
	{
		for (int i = 0; i < array.length / 2; i++)
		{
			int auxIndex = array.length - i - 1;
			String aux =  array[auxIndex];
			array[auxIndex] = array[i];
			array[i] = aux;
		}
	}
	
	public static void reverse(ArrayList<String> array)
	{
		for (int i = 0; i < array.size() / 2; i ++)
		{
			int auxIndex = array.size() - i - 1;
			String aux =  array.get(auxIndex);
			array.set(auxIndex, array.get(i));
			array.set(i, aux);
		}
	}		
	
	private static void println(String [] array)
	{
		System.out.print("{\t");
		for (String string : array)
		{
			System.out.print(string + "\t");
		}
		System.out.println("}");
	}
	
	private static void println(ArrayList<String> array)
	{
		System.out.print("{\t");
		for (String string : array)
		{
			System.out.print(string + "\t");
		}
		System.out.println("}");
	}
	
	public static int min(int [] array)
	{
		int min = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < min) 
				min = array[i];
		}
		return min;
	}
	
	public static int min(int [][] matrix)
	{
		int min = min(matrix[0]);
		for (int j = 1; j < matrix.length; j++)
		{
			int minArray = min(matrix[j]);
			if (minArray < min)
				min = minArray;
		}
		return min;		
	}
}