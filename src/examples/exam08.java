package examples;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1=new Car("빨강", 0);
		Car myCar2=new Car("파랑", 0);
		Car myCar3=new Car("초록", 0);
		
		System.out.println("생산된 차의 대수(정적필드)==>" + Car.carCount);
		System.out.println("생산된 차의 대수(정적메소드)==>" + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도==>" + Car.MAXSPEED);
		System.out.println("PI의 값===>" + Math.PI);//java.lang.Math 클래스의 static 필드
		System.out.println("3의 5제곱" + Math.pow(3, 5));//java.lang.Math 클래스의 static 메소드
		

	}

}
