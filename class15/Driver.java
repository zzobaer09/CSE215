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
	
	public double CalculateTution() {
		return 0.0;
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
	public double CalculateTution() {
		//3.5 -> 10%
		
		double fee = credit_hour*6500;
		if(getCGPA()>3.5) fee = fee - fee*0.1;
		return fee;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nCredit Hour: "+ credit_hour;
	}
}

class GStudent extends Student{
	private double UGCGPA;
	private int year;
	public int credit_hour;
	public GStudent(){
		super();
	}
	public GStudent(String name, int ID, double CGPA, String email,double UGCGPA,int year,int credit_hour) {
		super(name,ID,CGPA,email);
		this.UGCGPA = UGCGPA;
		this.year = year;
		this.credit_hour = credit_hour;
		
	}
	
	@Override
	public double CalculateTution() {
		//3.8 -> 11%
		
		double fee = credit_hour*6500;
		if(getCGPA()>3.8) fee = fee - fee*0.12;
		return fee;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nUG CGPA: "+ UGCGPA + "\nYear:"+year;
	}
}


public class Driver {

	public static void CompareTution(Student s1, Student s2) {
		System.out.println("Students are: "+s1.getName()+"&"+s2.getName());
		if(s1.CalculateTution()>s2.CalculateTution()) System.out.println(s1.getName()+" is paying heigher tuition fee");
		else if(s1.CalculateTution()==s2.CalculateTution()) System.out.println("Both paying same tuition");
		else System.out.println(s2.getName()+" is paying heigher tuition fee");
	}
	
	public static void main(String[] args) {
		
		GStudent [] students = new GStudent[2];
		students[0] = new GStudent("Aba",234,3.6,"aba@email.com",2.3,2002,6);
		students[1] = new GStudent("baba",232,3.93,"nana@email.com",2.2,2002,30);
		
		UGStudent [] Ustudents = new UGStudent[2];
		Ustudents[0] = new UGStudent("Kane",234,3.6,"aba@email.com",6);
		Ustudents[1] = new UGStudent("Jude",232,3.93,"nana@email.com",30);
		
		
		CompareTution(students[0], students[1]);

		CompareTution(Ustudents[0], Ustudents[1]);
		
		CompareTution(Ustudents[0], students[1]);
	
		CompareTution(students[0], Ustudents[1]);
		
		CompareTution(students[0], Ustudents[0]);
		CompareTution(students[1], Ustudents[1]);
	}

}
