package pojo;

public class Square extends Shape{
	double side;

	public Square(String color, double side) {
		super(color);
		this.side=side;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		double area;
		area=side*side;
		System.out.println("Area of square is ");
		return area;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter=4*side;
		System.out.println("Perimeter of square is ");
		return perimeter;
	}
	
	public void displayDetails() {
		System.out.println("This is " + color + " square.");
	}

}
