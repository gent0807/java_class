package examples;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car("빨강", 0);
		
		
		Car myCar2 = new Car("파랑",0);
		
		
		Car myCar3 = new Car("초록",0);
		
		
		myCar1.upSpeed(50);
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며 속도는 "+myCar1.speed+"km입니다.");
		
		myCar2.downSpeed(20);
		System.out.println("자동차2의 색상은 "+myCar2.getColor()+"이며 속도는 "+myCar2.speed+"km입니다.");
		
		myCar3.upSpeed(250);
		System.out.println("자동차3의 색상은 "+myCar3.getColor()+"이며 속도는 "+myCar3.speed+"km입니다.");

	}

}
