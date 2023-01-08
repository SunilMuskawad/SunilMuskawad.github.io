package pojo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle("red",10.5);
		System.out.println(circle.calArea());
		System.out.println(circle.calPerimeter());
		circle.displayDetails();
		
		Rectangle rectangle = new Rectangle("red",10.5, 20.5);
		System.out.println(rectangle.calArea());
		System.out.println(rectangle.calPerimeter());
		rectangle.displayDetails();
		
		Square square = new Square("red",10.5);
		System.out.println(square.calArea());
		System.out.println(square.calPerimeter());
		square.displayDetails();
		
		Triangle triangle = new Triangle("red",10.5,11.5,20.5,15.5);
		System.out.println(triangle.calArea());
		System.out.println(triangle.calPerimeter());
		triangle.displayDetails();
	}

}
