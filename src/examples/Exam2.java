package examples;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pizza = new Circle2(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle2 donut = new Circle2();
		donut.name="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name + "의 면적은 "+area);

	}

}
