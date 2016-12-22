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
}