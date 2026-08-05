abstract class Polygon{
	private int numSide;

	Polygon(int numSide){
		this.numSide = numSide;
	}

	public int getNumSide() {
		return numSide;
	}
	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}

	abstract public double area();
	abstract public double perimeter();
}

class Triangle1 extends Polygon{
	private double sideA;
	private double sideB;
	private double sideC;

	Triangle1(int numSide,double sideA, double sideB, double sideC){
		super(numSide);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double area() {
		double s = (sideA+sideB+sideC)/2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
	public double perimeter() {
		return sideA+sideB+sideC;
	}
}

public class Task1 {

	public static void main(String[] args) {
		Triangle1 triangle = new Triangle1(3,3, 4, 5);
		System.out.println("Number of sides: " + triangle.getNumSide());
		System.out.println("Area: " + triangle.area());
		System.out.println("Perimeter: " + triangle.perimeter());
	}

}