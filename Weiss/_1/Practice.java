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
	}
	
	public static boolean isNotLeap(int year) 
	{
		return !(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}
}