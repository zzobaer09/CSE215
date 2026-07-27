class Student {
	
	private String name;
	private int ID;
	private double CGPA;
	private String email;
	public static int counter = 0;
	
	public Student() {
		
		this.name = "Not Assigned";
		this.ID = 0;
		this.CGPA = 0.0;
		this.email = "Not Assigned";
		counter++;
	}
	
	public Student (String name, int ID, double CGPA, String email) {
		
		this.name = name;
		this.ID = ID;
		this.CGPA = CGPA;
		this.email = email;
		counter++;
	}
	
	public Student (Student obj) {
		
		this.name = obj.name;
		this.ID = obj.ID;
		this.CGPA = obj.CGPA;
		this.email = obj.email;
		counter++;
	}
	
	public String getName() { 
		return this.name;
	}
	
	
	public int getID() { 
		return this.ID;
	}
	
	public double getCGPA() { 
		return this.CGPA;
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
	public void setCGPA(double CGPA) {
		this.CGPA = CGPA;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double CalculateCGPA() {
		return this.CGPA;
	}
	public double CalculateCGPA(double cg1, double cg2) {
		return this.CGPA = (cg1+cg2)/2.0;
	}
	public double CalculateCGPA(double cg1, double cg2, double cg3) {
		return this.CGPA = (cg1+cg2+cg3)/3.0;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"\nID: "+ ID + "\nCGPA: "+CGPA + "\nEmail: " + email;
	}
}

class UGStudent extends Student{
	private int credit_hour;
	public UGStudent(){
		super();
	}
	public UGStudent(String name, int ID, double CGPA, String email,int credit_hour) {
		super(name,ID,CGPA,email);
		this.credit_hour = credit_hour;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nCredit Hour: "+ credit_hour;
	}
}

class GStudent extends Student{
	private double UGCGPA;
	private int year;
	public GStudent(){
		super();
	}
	public GStudent(String name, int ID, double CGPA, String email,double UGCGPA,int year) {
		super(name,ID,CGPA,email);
		this.UGCGPA = UGCGPA;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nUG CGPA: "+ UGCGPA + "\nYear:"+year;
	}
}


public class App {

	public static void main(String[] args) {
		
		GStudent [] students = new GStudent[2];
		
		students[0] = new GStudent("Aba",346,2.6,"ababa@email.com",3.99,1999);
		students[1] = new GStudent("Kabir",2345,3.6,"kabir@email.com",2.59,1823);
		
		for(GStudent s:students) System.out.println(s);
	}

}
