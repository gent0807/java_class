package examples;

public class exam05 {
	static int var= 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0; //exam05 Ŭ������ �ʵ��, static���� ����� int Ÿ���� var���� �ٸ� ���������� ����� ���� var�̴�.
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