package examples02;
import java.util.*;
public class PhoneBook {
	static ArrayList<Phone> p= new ArrayList<Phone>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		System.out.print("�ο���>>");
		
		int n=a.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String s1=a.next();
			String s2=a.next();
			
			Phone b=new Phone(s1,s2);
			p.add(b);
		}
		System.out.println("����Ǿ����ϴ�........");
		
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String inname= a.next();
			if(inname.equals("�׸�"))
				break;
			String tel=search(inname);
			if(tel==null) {
				System.out.println(inname+" �� �����ϴ�.");
			}
			else
				System.out.println(inname+"�� ��ȣ�� "+tel+"�Դϴ�.");
	  }
    }
	
	static String search(String str) {
		for(int i=0; i<p.size();i++) {
			if(str.equals(p.get(i).getName())) 
				return p.get(i).getTel();
		
	}
		return null;
		
	}
}
