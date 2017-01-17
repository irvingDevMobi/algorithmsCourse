public class Project{

	public static void main(String ... args) 
	{
		for (int i = 1; i < 5000; i = i*2) {
			System.out.println(i + "\t - " + getRomanNumeral(i));
		}		
	}
	
	public static void brackets(int howMany, int lineLength) 
	{
		System.out.println();
		for(int i = 1; (i * 3) <= lineLength && i <= howMany; i++)
		{
			System.out.print("[" + i + "]");
		}
	}
	
	public static void couples() 
	{
		for(int a = 1; a < 499; a++)	
		{
			for(int b = a +1; b < 500; b++) {
				if ((a*a + b*b + 1) % (b*a) == 0)
				{
					System.out.println("(" + a + "," + b + ")");
				}
			}
		}
	}
	
	public static String getRomanNumeral(int number) {
		StringBuilder builder = new StringBuilder();
		if (number >= 4000) 
		{
			String thousands = "[" + getRomanNumeral(number / 1000) + "*thousand]";
			builder.append(thousands);
			number = (number % 1000); 
		}
		if (number >= 1000) 
		{
			int mDigits	= number / 1000;
			builder.append(getRomanPattern(mDigits, 'M', '?', '?'));
			number = number % 1000;
		}
		if (number >= 100)
		{
			int cDigits = number / 100;
			builder.append(getRomanPattern(cDigits, 'C', 'D', 'M'));
			number = number % 100;
		}
		if (number >= 10) 
		{
			int dDigits = number / 10;
			builder.append(getRomanPattern(dDigits, 'X', 'L', 'C'));
			number = number % 10;	
		}
		if (number >= 0) 
		{
			builder.append(getRomanPattern(number, 'I', 'V', 'X'));
		}
		return builder.toString();
	}
	
	private static String getRomanPattern(int digit, char unit, char middle, char next)
	{
		if (digit == 9)
		{
			return "" + unit + next;
		} else if (digit == 4) 
		{
			return "" + unit + middle;
		} else if (digit >= 5) 
		{
			return "" + middle + getRomanDigits(digit - 5, unit);
		} else 
		{
			return getRomanDigits(digit, unit);
		}
	}
	
	private static String getRomanDigits(int digits, char unit) {
		StringBuilder result = new StringBuilder();
		for (int u = 0; u < digits; u++) 
		{
			result.append(unit);
		}
		return result.toString();
	}
}