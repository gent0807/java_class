package examples;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1=new Car("����", 0);
		Car myCar2=new Car("�Ķ�", 0);
		Car myCar3=new Car("�ʷ�", 0);
		
		System.out.println("����� ���� ���(�����ʵ�)==>" + Car.carCount);
		System.out.println("����� ���� ���(�����޼ҵ�)==>" + Car.currentCarCount());
		System.out.println("���� �ְ� ���� �ӵ�==>" + Car.MAXSPEED);
		System.out.println("PI�� ��===>" + Math.PI);//java.lang.Math Ŭ������ static �ʵ�
		System.out.println("3�� 5����" + Math.pow(3, 5));//java.lang.Math Ŭ������ static �޼ҵ�
		

	}

}