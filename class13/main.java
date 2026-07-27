class Person{
	private String name;
	private String gender;
	private int age;
	
	Person(){
		this.name = "NO NAME";
		this.gender = "NO GENDER";
		this.age = -99999;
	}
	Person(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	public void setGender(String gender) { 
		this.gender = gender;
	}
	public void setAge(int age) { 
		this.age = age;
	}
	public String toString() {
		return "Name: "+name+"\ngender: "+ gender + "\nage: "+age;
	}
	
}
class Employee extends Person{
	private String ID;
	private String department;
	private double salary;
	
	Employee(){
		super();
	}
	Employee(String name, String gender, int age,String ID,String department, double salary){
		super(name,gender,age);
		this.ID = ID;
		this.department = department;
		this.salary = salary;
	}
	public void setID(String ID) { 
		this.ID = ID;
	}
	public void setDepartment(String department) { 
		this.department = department;
	}
	public void setSalary(double salary) { 
		this.salary = salary;
	}
	public String toString() {
		return super.toString()+ "\nID: "+ID+"\ndepartment: "+ department + "\nsalary: "+salary;
	}
}
class Faculty extends Employee{
	private String initial;
	private String rank;
	Faculty(){
		super();
	}
	Faculty(String name, String gender, int age,String ID,String department, double salary,String initial, String rank){
		super(name,gender,age,ID,department,salary);
		this.initial = initial;
		this.rank = rank;
	}
	public void setInitial(String initial) { 
		this.initial = initial;
	}
	public void setRank(String rank) { 
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString()+ "\ninitial: "+initial+"\nrank: "+ rank;
	}
}

public class Main {

	public static void main(String[] args) {
		Faculty f = new Faculty("kja","malle",33,"34","CSE",34632,"ks","Professor");
		System.out.println(f);
	}

}
