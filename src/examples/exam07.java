package examples;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car("����", 0);
		
		
		Car myCar2 = new Car("�Ķ�",0);
		
		
		Car myCar3 = new Car("�ʷ�",0);
		
		
		myCar1.upSpeed(50);
		System.out.println("�ڵ���1�� ������ "+myCar1.getColor()+"�̸� �ӵ��� "+myCar1.speed+"km�Դϴ�.");
		
		myCar2.downSpeed(20);
		System.out.println("�ڵ���2�� ������ "+myCar2.getColor()+"�̸� �ӵ��� "+myCar2.speed+"km�Դϴ�.");
		
		myCar3.upSpeed(250);
		System.out.println("�ڵ���3�� ������ "+myCar3.getColor()+"�̸� �ӵ��� "+myCar3.speed+"km�Դϴ�.");

	}

}
