package examples02;
import java.util.*;

class Student{
	String major;
	int num;
	double score;
	Student(String major, int num, double score){
		this.major=major;
		this.num=num;
		this.score=score;
	}
	public String toString() {
		return this.major+", "+this.num+", "+this.score;
	}
}
public class 컬렉션과제네릭기법실습5번02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map= new HashMap<String, Student>();
        String[] c=new String[4];
		Scanner scanner=new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String a= scanner.nextLine();
			String[] b=a.split(", ");
            c[i]=b[0];
			String d=b[1];
			String e=b[2];
			String f=b[3];
			int g=Integer.parseInt(e);
			double h=Double.parseDouble(f);
			map.put(c[i],new Student(d, g, h));
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("---------------------");
			System.out.println("�̸�:"+c[i]);
			System.out.println("����:"+map.get(c[i]).major);
			System.out.println("�й�:"+ map.get(c[i]).num);
			System.out.println("�������:"+ map.get(c[i]).score);
		}
		
		while(true) {
			System.out.print("�л� �̸� >> ");
			String a= scanner.nextLine();
			for(int i=0; i<4; i++) {
					if(a==c[i]) {
						System.out.println(map.get(c[i]).toString());
					}
				}
			if(a=="�׸�") {
				break;
			}
				
		}
	}

}

