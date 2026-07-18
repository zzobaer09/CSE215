class Student {
	
	private String name;
	private int ID;
	private double CGPA;
	private String email;
	
	public Student() {
		
		this.name = "Not Assigned";
		this.ID = 0;
		this.CGPA = 0.0;
		this.email = "Not Assigned";
		
	}
	
	public Student (String name, int ID, double CGPA, String email) {
		
		this.name = name;
		this.ID = ID;
		this.CGPA = CGPA;
		this.email = email;
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
}


public class Main {

	public static void main(String[] args) {
		

		Student[] arr = new Student[10];
        
		arr[0] = new Student();
		arr[0].setName("Alice");
		arr[0].setID(123);
		arr[0].setCGPA(3.5);
		arr[0].setEmail("alice@nsu.edu");
        
		System.out.print("Name: " + arr[0].getName() + "\nID: " + arr[0].getID() + "\nCGPA: " + arr[0].getCGPA() + "\nEmail: " + arr[0].getEmail());
		
		arr[1] = new Student();
		arr[1].setName("kad;flk");
		arr[1].setID(73);
		arr[1].setCGPA(2.5);
		arr[1].setEmail("kasde@nsu.edu");
        
		System.out.print("Name: " + arr[1].getName() + "\nID: " + arr[1].getID() + "\nCGPA: " + arr[1].getCGPA() + "\nEmail: " + arr[1].getEmail());
		
		
		
		arr[2] = new Student();
		arr[2].setName("klsjg");
		arr[2].setID(1363);
		arr[2].setCGPA(1.95);
		arr[2].setEmail("ksja@nsu.edu");
        
		System.out.print("Name: " + arr[2].getName() + "\nID: " + arr[2].getID() + "\nCGPA: " + arr[2].getCGPA() + "\nEmail: " + arr[2].getEmail());
		
		
		arr[3] = new Student();
		arr[3].setName("kaha");
		arr[3].setID(1263);
		arr[3].setCGPA(3.536);
		arr[3].setEmail("kajb@nsu.edu");
        
		System.out.print("Name: " + arr[3].getName() + "\nID: " + arr[3].getID() + "\nCGPA: " + arr[3].getCGPA() + "\nEmail: " + arr[3].getEmail());
		
		arr[4] = new Student();
		arr[4].setName("hankna");
		arr[4].setID(837);
		arr[4].setCGPA(2.57);
		arr[4].setEmail("uay@nsu.edu");

		System.out.print("Name: " + arr[4].getName() + "\nID: " + arr[4].getID() + "\nCGPA: " + arr[4].getCGPA() + "\nEmail: " + arr[4].getEmail());
		
		
		arr[5] = new Student ("shkjla", 2678, 3.9, "jhkl.nahiyan@northsouth.edu");	
		System.out.print("Name: " + arr[5].getName() + "\nID: " + arr[5].getID() + "\nCGPA: " + arr[5].getCGPA() + "\nEmail: " + arr[5].getEmail());
	
		
		arr[6] = new Student ("aphio", 657, 3.34, "owuie.nahiyan@northsouth.edu");	
		System.out.print("Name: " + arr[6].getName() + "\nID: " + arr[6].getID() + "\nCGPA: " + arr[6].getCGPA() + "\nEmail: " + arr[6].getEmail());
	
		arr[7] = new Student ("wpaiho", 4783, 3.9, "fjanahiyan@northsouth.edu");	
		System.out.print("Name: " + arr[7].getName() + "\nID: " + arr[7].getID() + "\nCGPA: " + arr[7].getCGPA() + "\nEmail: " + arr[7].getEmail());
		
		arr[8] = new Student ("jklasd", 327, 2.9, "uiodas.nahiyan@northsouth.edu");	
		System.out.print("Name: " + arr[8].getName() + "\nID: " + arr[8].getID() + "\nCGPA: " + arr[8].getCGPA() + "\nEmail: " + arr[8].getEmail());
		
		arr[9] = new Student ("jkldas", 623, 3.23, "kljh.nahiyan@northsouth.edu");	
		System.out.print("Name: " + arr[9].getName() + "\nID: " + arr[9].getID() + "\nCGPA: " + arr[9].getCGPA() + "\nEmail: " + arr[9].getEmail());

	}

}
