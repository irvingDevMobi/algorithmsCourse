public class Test
{
	public static void main(String [] args)
	{
		/** 
			Exercise 4.18
			
			a)
		**/
		
		Base [] arrBase = new Base[2];
		// Fix: index 2 to 1
		// arrBase[0] = arrBase[2] = new Derived();
		arrBase[0] = arrBase[1] = new Derived();
		
		Derived x = (Derived) arrBase[0];
		// Error: java.lang.ClassCastException
		// Derived y = ((Derived[]) arrBase) [0];
		
		
		/**
			b)
		**/
		
		Derived [] arrDer = new Derived[2];
		arrDer[0] = arrDer[1] = new Derived();
		
		Base xB = arrDer[0];
		// Extra casting
		Base yB = ((Base[])arrDer)[0];
		
		/**
			c)
		**/
		
		Base [] arrB2 = new Derived[2];
		arrB2[0] = arrB2[1] = new Derived();
		
		Derived x2 = (Derived) arrB2[0];
		Derived y2 = ((Derived[]) arrB2)[0];
		
		/**
			d)
		**/
		
		// Fix size 1 to 2
		Base [] arr3 = new Derived[2];
		
		// ERROR: java.lang.ArrayStoreException
        arr3[0] = arr3[1] = new Base();
		
	}
}