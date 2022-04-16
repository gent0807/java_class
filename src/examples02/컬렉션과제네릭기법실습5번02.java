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
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
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
			System.out.println("이름:"+c[i]);
			System.out.println("전공:"+map.get(c[i]).major);
			System.out.println("학번:"+ map.get(c[i]).num);
			System.out.println("학점평균:"+ map.get(c[i]).score);
		}
		while(true) {
			System.out.print("학생 이름 >> ");
			String a= scanner.nextLine();
			for(int i=0; i<4; i++) {
					if(a==c[i]) {
						System.out.println(map.get(c[i]).toString());
					}
				}
			if(a=="그만") {
				break;
			}
				
			
		}
	}

}

