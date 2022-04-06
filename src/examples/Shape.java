package examples;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle3 extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}