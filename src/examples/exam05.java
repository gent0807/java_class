package examples;

public class exam05 {
	static int var= 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0; //exam05 클래스의 필드로, static으로 선언된 int 타입의 var과는 다른 지역변수로 선언된 변수 var이다.
		System.out.println(var);
		
		int sum = addFunction(10,20);
		System.out.println(sum);

	}
	
	static int addFunction (int num1, int num2) {
		int hap;
		hap = num1+num2+var;
		return hap;
		
		
	}

}
