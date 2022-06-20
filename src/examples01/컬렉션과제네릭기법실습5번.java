package examples01;
import java.util.*;



class Student{
	String name;
	String major;
	int num;
	double score;
	Student(String name, String major, int num, double score){
		this.name=name;
		this.major=major;
		this.num=num;
		this.score=score;
	}
	public String toString() {
		return this.name+", "+this.major+", "+this.num+", "+this.score;
	}
}
public class 컬렉션과제네릭기법실습5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr= new ArrayList<Student>();
		Scanner scanner=new Scanner(System.in);
		System.out.println(".");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String a= scanner.nextLine();
			String[] b=a.split(", ");
			String c=b[0];
			String d=b[1];
			String e=b[2];
			String f=b[3];
			int g=Integer.parseInt(e);
			double h=Double.parseDouble(f);
			arr.add(new Student(c, d, g, h));
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("---------------------");
			System.out.println(":"+arr.get(i).name);
			System.out.println(":"+arr.get(i).major);
			System.out.println(":"+arr.get(i).num);
			System.out.println(":"+arr.get(i).score);
		}
		while(true) {
			System.out.print(">> ");
			String a= scanner.nextLine();
			for(int i=0; i<4; i++) {
					if(a.equals(arr.get(i).name)) {
						System.out.println(arr.get(i).toString());
					}
				}
			if(a.equals("")) {
				break;
			}
				
			
		}
	}

}
