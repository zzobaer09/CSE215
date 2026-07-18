class Student {
	
	String name;
	int ID;
	double CGPA;
	String email;
	
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
	
}


public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.print("Name: " + s1.name + "\nID: " + s1.ID + "\nCGPA: " + s1.CGPA + "\nEmail: " + s1.email );
		
		System.out.print(" \n\nStudent 1's Information: \\n");
		
		s1.name = "Alice";
		s1.ID = 123;
		s1.CGPA = 3.5;
		s1.email = "alice@nsu.edu";
		
		System.out.print("Name: " + s1.name + "\nID: " + s1.ID + "\nCGPA: " + s1.CGPA + "\nEmail: " + s1.email );
		
		System.out.print(" \n\nStudent 2's Information: \\n");
		
		Student s2 = new Student();
		
		s2.name = "Tahsan";
		s2.ID = 456;
		s2.CGPA = 3.6;
		s2.email = "tahsan.masud@northsouth.edu";
		
		System.out.print("Name: " + s2.name + "\nID: " + s2.ID + "\nCGPA: " + s2.CGPA + "\nEmail: " + s2.email );
		
		System.out.print(" \n\nStudent 3's Information: \\n");
		
		Student s3 = new Student();
		
		s3.name = "Arnaf";
		s3.ID = 789;
		s3.CGPA = 3.7;
		s3.email = "arnaf.singh@northsouth.edu";
		
		System.out.print("Name: " + s3.name + "\nID: " + s3.ID + "\nCGPA: " + s3.CGPA + "\nEmail: " + s3.email );
		
		System.out.print(" \n\nStudent 4's Information: \\n");
		
		Student s4 = new Student();
		
		s4.name = "Shafkat";
		s4.ID = 101112;
		s4.CGPA = 3.8;
		s4.email = "shafkat.hossain@northsouth.edu";
		
		System.out.print("Name: " + s4.name + "\nID: " + s4.ID + "\nCGPA: " + s4.CGPA + "\nEmail: " + s4.email );
		
		System.out.print(" \n\nStudent 5's Information: \\n");
		
		Student s5 = new Student();
		
		s5.name = "Shabab";
		s5.ID = 131415;
		s5.CGPA = 3.9;
		s5.email = "shabab.khan@northsouth.edu";
		
		System.out.print("Name: " + s5.name + "\nID: " + s5.ID + "\nCGPA: " + s5.CGPA + "\nEmail: " + s5.email );
	
		
		
		
		System.out.print(" \n\nStudent 6's Information: \n");
		
		Student s6 = new Student ("Bob", 12, 3.8, "bob@nsu.edu");	
		System.out.print("Name: " + s6.name + "\nID: " + s6.ID + "\nCGPA: " + s6.CGPA + "\nEmail: " + s6.email );
	
		System.out.print(" \n\nStudent 7's Information: \n");
		
		Student s7 = new Student ("Shompreet", 161718, 4.0, "shompreet.rasheed@northsouth.edu");	
		System.out.print("Name: " + s7.name + "\nID: " + s7.ID + "\nCGPA: " + s7.CGPA + "\nEmail: " + s7.email );
	
		System.out.print(" \n\nStudent 8's Information: \n");
		
		Student s8 = new Student ("Nahiyan", 192021, 3.9, "abdullah.nahiyan@northsouth.edu");	
		System.out.print("Name: " + s8.name + "\nID: " + s8.ID + "\nCGPA: " + s8.CGPA + "\nEmail: " + s8.email );
	
		System.out.print(" \n\nStudent 9's Information: \n");
		
		Student s9 = new Student ("Mashroor", 192021, 3.2, "mashroor.haider@northsouth.edu");	
		System.out.print("Name: " + s9.name + "\nID: " + s9.ID + "\nCGPA: " + s9.CGPA + "\nEmail: " + s9.email );
	
		System.out.print(" \n\nStudent 10's Information: \n");
		
		Student s10 = new Student ("Ashraf", 222324, 3.0, "ashraf.ali@northsouth.edu");	
		System.out.print("Name: " + s10.name + "\nID: " + s10.ID + "\nCGPA: " + s10.CGPA + "\nEmail: " + s10.email );
	
	}

}

