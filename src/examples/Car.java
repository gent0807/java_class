package examples;

public class Car {
	String color;
	int speed = 0;
	static int carCount=0; //��ü ������ �����ϴ� �� �ƴ϶� Car Ŭ�������� �����Ѵ�.
	final static int MAXSPEED = 200;//��ü ������ �����ϴ� �� �ƴ϶� Car Ŭ�������� �����Ѵ�.
	final static int MINSPEED = 0;//��ü ������ �����ϴ� �� �ƴ϶� Car Ŭ�������� �����Ѵ�.
	
	static int currentCarCount() {
		return carCount;
	}//��ü ������ �����ϴ� �� �ƴ϶� Car Ŭ�������� �����Ѵ�.
	
	Car (String color, int speed){
		this.color= color;
		this.speed= speed;
		carCount++;
	}
	
	Car(){}
	Car(int speed){
		this.speed=speed;
	}
	int getSpeed() {
		return speed;
	}
	
	void upSpeed(int value) {
		if(speed+value>=200)
			speed=200;
	
	
		else 
		speed=speed+value;
	}
	
	void downSpeed(int value) {
		if(speed -value<=0)
			speed=0;
		else speed=speed-value;
	}

	String getColor() {
		return color;
	}
}
