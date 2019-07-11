package coreJavaCayHorstman;

public class EmployeeManagerTest {

	public static void main(String[] args) 
	{
		
		//Construct a Manager object
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		
		String bossName = boss.getName();
		System.out.println(bossName);
		
		//Construct an Employee array object of employees
		Employee[] staff = new Employee[3];
		
		//Populate the array with a mix of Manager and Employee objects
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 9);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 12, 28);		
		
		// print out information about all Employee objects
		for(Employee e:staff)
			System.out.println(e.getName() + " " + e.getSalary() + " since " + e.getHireDay());
		
	}
	
}
