package pojo;

public class Circle extends Shape{
	double radius;
	double pi =3.14;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
	}
	
	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double area;
		area=pi*radius*radius;
		System.out.println("Area of circle is ");
		return area;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter=2*pi*radius;
		System.out.println("Perimeter of circle is ");
		return perimeter;
	}
	
	public void displayDetails() {
		System.out.println("This is " + color + " circle.");		
	}
}
