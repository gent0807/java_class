package examples02;

import java.util.Scanner;
/*
 20210133 ������ 
 */
 

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		
		Grade me= new Grade(math, science, english);
		System.out.println("���� ����� " +me.average());
		System.out.println("���������� "+me.getMath()+" ���������� "+me.getScience()+" ���������� "+me.getEnglish());
		Grade haha=new Grade();
		System.out.println("������ ����� " +me.average());
		System.out.println("���������� "+me.getMath()+" ���������� "+me.getScience()+" ���������� "+me.getEnglish());
		scanner.close();
	}

}
