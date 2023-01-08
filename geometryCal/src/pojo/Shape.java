package pojo;

public abstract class Shape {
	String color;
	
	public Shape(String color) {
		this.color=color;
	}
	
	public abstract double calArea();
	public abstract double calPerimeter();
	public void displayDetails() {
		System.out.println("This is" +this.color + "shape");
	}
}


