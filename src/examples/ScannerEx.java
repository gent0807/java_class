package examples;
import java.util.*;
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�");
		
		String name= scanner.next();
		System.out.print("�̸��� "+name+", ");
		
		String city = scanner.next();
		System.out.print("���ô�"+city+", ");
		
		int age=scanner.nextInt();
		System.out.print("���̴� "+age+"��, ");
		
		double weight=scanner.nextDouble();
		System.out.print("ü���� "+weight+"kg, ");
		
		boolean single =scanner.nextBoolean();
		System.out.println("���� ���δ� "+single+"�Դϴ�. ");
		
		scanner.close();
	}

}
