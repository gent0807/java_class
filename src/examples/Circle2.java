package examples;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2() {
		radius=1;
		name="";
	}
	
	public Circle2(int r, String n) {
		radius=r;
		name=n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	

}
