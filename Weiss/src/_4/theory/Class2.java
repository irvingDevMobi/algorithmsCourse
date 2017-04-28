public class Class2
{
	public static void main(String [] args)
	{
		Class1 obj = new Class1();
		System.out.println(obj.getX());
	}
}

/** 
	a)	512
 
	b)	String getX()
	
	c) 17
	
	d)	int getX()
	
	e)	Exception in thread "main" java.lang.NoSuchMethodError: Class1.getX()I
        at Class2.main(Class2.java:6)
		
	f) 	
 **/