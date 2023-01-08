package pojo;

public class Triangle extends Shape{

	double base;
	double height;
	double a;
	double b;
	
	public Triangle(String color, double base, double height, double a, double b) {
		super(color);
		this.base=base;
		this.height=height;
		this.a=a;
		this.b=b;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double area;
		area=(base*height)/2;
		System.out.println("Area of triangle is ");
		return area;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter=base+a+b;
		System.out.println("Perimeter of triangle is ");
		return perimeter;
	}
	
	public void displayDetails() {
		System.out.println("This is " + color + " Triangle.");
	}
}
