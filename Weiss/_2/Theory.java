public class Theory {

	public static void main(String [] args) 
	{
		System.out.println(foo());  // 1
		int x = 3;
		int y = 1;
		System.out.println(x + ' ' + y); // "36"
		System.out.println(x + " " + y); // "3 1"
		bar();
	}
	
	public static int foo()
	{
		try
		{
			return 0;
		}
		finally
		{
			return 1;
		}
	}
	
	public static void bar()
	{
		try
		{
			throw new NullPointerException();
		}
		finally
		{
			throw new ArithmeticException();
		}
	}
	
}