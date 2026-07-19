class Employee {
	
	private String name;
	private int ID;
	private double salary;
	private String email;
	public static int counter = 0;
	
	public Employee() {
		
		this.name = "Not Assigned";
		this.ID = 0;
		this.salary = 0.0;
		this.email = "Not Assigned";
		counter++;
	}
	
	public Employee (String name, int ID, double salary, String email) {
		
		this.name = name;
		this.ID = ID;
		this.salary = salary;
		this.email = email;
		counter++;
	}
	
	public Employee (Employee obj) {
		
		this.name = obj.name;
		this.ID = obj.ID;
		this.salary = obj.salary;
		this.email = obj.email;
		counter++;
	}
	
	public String getName() { 
		return this.name;
	}
	
	
	public int getID() { 
		return this.ID;
	}
	
	public double getSalary() { 
		return this.salary;
	}
	
	public String getEmail() { 
		return this.email;
	}
	
	public static int getCounter() {
		return counter;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


public class Task {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Zobaer",253042,20000,"zzobaer09@email.com");
		System.out.println("Name: " + e1.getName() + "\nID: " + e1.getID() + "\nSalary: " + e1.getSalary() + "\nEmail: " + e1.getEmail());
		System.out.println();
		
		Employee e2 = new Employee("abc",253063,99999,"abc@email.com");
		System.out.println("Name: " + e2.getName() + "\nID: " + e2.getID() + "\nSalary: " + e2.getSalary() + "\nEmail: " + e2.getEmail());
		System.out.println();
		
		Employee e3 = new Employee(e1);
		System.out.println("Name: " + e3.getName() + "\nID: " + e3.getID() + "\nSalary: " + e3.getSalary() + "\nEmail: " + e3.getEmail());
		System.out.println();
		System.out.println("Total Employee number: "+Employee.getCounter());
	}

}
