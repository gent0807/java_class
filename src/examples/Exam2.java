package examples;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pizza = new Circle2(10, "�ڹ�����");
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle2 donut = new Circle2();
		donut.name="��������";
		area=donut.getArea();
		System.out.println(donut.name + "�� ������ "+area);

	}

}
