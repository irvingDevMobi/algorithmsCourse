public class Test {

	public static void main(String [] args) {
	
		Person p = new Person();
		Student s = new Student();
		Employee e = new Employee();
		Person x = e;
		
		x.print();
		if (x instanceof Person)
		{
			System.out.println("X is a Person");
		}
		if (x instanceof Student)
		{
			System.out.println("X is a Studen");
		}
		if (x instanceof Employee)
		{
			System.out.println("X is a Employee");
		}
	}
	
}	