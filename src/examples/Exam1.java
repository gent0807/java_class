package examples;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 pizza;
		pizza= new Circle1();
		pizza.radius=10;
		pizza.name="자바피자";
		double area= pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
	
		Circle1 donut=new Circle1();
		donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
