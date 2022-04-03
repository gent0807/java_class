package examples;

public class Car {
	String color;
	int speed = 0;
	static int carCount=0; //객체 각각에 존재하는 게 아니라 Car 클래스에만 존재한다.
	final static int MAXSPEED = 200;//객체 각각에 존재하는 게 아니라 Car 클래스에만 존재한다.
	final static int MINSPEED = 0;//객체 각각에 존재하는 게 아니라 Car 클래스에만 존재한다.
	
	static int currentCarCount() {
		return carCount;
	}//객체 각각에 존재하는 게 아니라 Car 클래스에만 존재한다.
	
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
