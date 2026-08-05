abstract class Shape{
	private String name;
	Shape(String name){
		this.name = name;
	}
	
	public String getName() {
			return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract public double area();
	abstract public double perimeter();
}


class Rectangle extends Shape{
	private double length;
	private double width;
	
	Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {return length*width;}
	public double perimeter() {return 2*(length+width);}
}

class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	
	Triangle(String name, double a, double b, double c){
			super(name);
			this.a = a;
			this.b = b;
			this.c = c;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double area() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter() {
		return a+b+c;
	}
	
}

public class Task {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle("Rectangle", 5, 3);
		Shape triangle = new Triangle("Triangle", 3, 4, 5);
 
		System.out.println(rectangle.getName() + " area: " + rectangle.area() + ", perimeter: " + rectangle.perimeter());
		System.out.println(triangle.getName() + " area: " + triangle.area() + ", perimeter: " + triangle.perimeter());

	}

}
