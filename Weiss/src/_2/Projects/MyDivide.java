import java.lang.ArithmeticException;

public class MyDivide{

	public static void main(String [] args)
	{
		float infinite = 1f/0.0f;
		System.out.println("Standar float division: " + infinite);
		try {
			divide(1.0f, 0f);
		} catch(ArithmeticException ex) {
			System.out.println("My custom exception: " + ex.getMessage());
		}
	}

	private static float divide(float dividend, float divisor) {
		if (divisor == 0.0f) {
			throw new ArithmeticException("Divisor invalid");
		}
		return dividend/divisor;
	}
}