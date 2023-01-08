package pojo;

public class Rectangle extends Shape {
	double height;
	double width;

	public Rectangle(String color, double height, double width) {
		super(color);
		this.height=height;
		this.width=width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double area;
		area=height*width;
		System.out.println("Area of rectangle is ");
		return area;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter=2*(height+width);
		System.out.println("Perimeter of rectangle is ");
		return perimeter;
	}
	
	public void displayDetails() {
		System.out.println("This is " + color + " rectangle");
	}
	

}
