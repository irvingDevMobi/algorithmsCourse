public class Practice {
	
	public static void main(String ... args)
	{
		for (int year = 0; year < 2500; year++) {
			if (isNotLeap(year)) {
				System.out.println(year + " is NOT a leap-year");
			} else {
				System.out.println(year + " is a leap-year");
			}
		}
		
		System.out.println(max(4,6,12,7));
		System.out.println(max(4,6,12,7,5));
		System.out.println(max(4,6,-12,7));
		System.out.println(max(4,6,2,7, 9));
		
		tables(4);
		tables(7);
		tables(5);
		tables(8);
	}
	
	public static boolean isNotLeap(int year) 
	{
		return !(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}
	
	public static int max(int x1, int x2, int x3, int x4) 
	{
		int max = x1;
		if (x2 > max)
			max = x2;
		if (x3 > max)
			max = x3;
		if (x4 > max)
			max = x4;
		return max;
	}
	
	public static int max(int x1, int x2, int x3, int x4, int x5) 
	{
		int max = max(x1, x2, x3, x4);
		if (x5 > max)
			max = x5;
		return max;
	}
	
	public static void tables(int digit) 
	{
		System.out.println("\nSum Table of " + digit);
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i + " + " + digit + " = " + (i + digit));
		}
		System.out.println("Multiplication Table of " + digit);
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i + " x " + digit + " = " + (i * digit));
		}	
	}
	
	public static void infinitiveLoop() 
	{
		while(true){/**Something*/}
	}
}