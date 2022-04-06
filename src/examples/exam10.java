package examples;

abstract class Animal{
	String name;
	abstract void move();
}

class Tiger extends Animal{
	int age;
	void move() {
		System.out.println("네발로 이동한다.");
	}
}

class Eagle extends Animal{
	String home;
	void move() {
		System.out.println("날개로 이동한다.");
	}
}
public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger1= new Tiger();
		Eagle eagle1 =new Eagle();
		
		tiger1.move();
		eagle1.move();
	}

}
