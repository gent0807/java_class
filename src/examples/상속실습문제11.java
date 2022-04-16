package examples;
import java.util.Scanner;
public class 상속실습문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두 정수와 연산자를 입력하시오.>>");
		Scanner a=new Scanner(System.in);
		
		String r=a.nextLine();
		
		String[] k=r.split(" ");
		int q=Integer.parseInt(k[0]);
		int b=Integer.parseInt(k[1]);
		
		if(k[2]=="+") {
			Add n= new Add();
			n.setValue(q, b);
			int m =n.calculate();
			System.out.println(m);
		}
		
		else if(k[2]=="-") {
			Sub n= new Sub();
			n.setValue(q, b);
			int m =n.calculate();
			System.out.println(m);
		}
		
		else if(k[2]=="*") {
			Mul n= new Mul();
			n.setValue(q, b);
			int m =n.calculate();
			System.out.println(m);
		}
		
		else if(k[2]=="/") {
			Div n= new Div();
			n.setValue(q, b);
			int m =n.calculate();
			System.out.println(m);
		}
		
		
		
		
	}
		
}