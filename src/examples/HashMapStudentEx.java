package examples;
import java.util.*;

class Student6{
	int id;
	String tel;
	public Student6(int id, String tel) {
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student6> map=new HashMap<String, Student6>();
		map.put("Ȳ����", new Student6(1, "010-111-1111"));
		map.put("���繮", new Student6(2, "010-222-2222"));
		map.put("�賲��", new Student6(3, "010-333-3333"));
		
		Scanner scanner= new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name= scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student6 stu=map.get(name);
			if(stu==null) {
				System.out.println(name+"�� ���� ����Դϴ�.");
			}
			else
				System.out.println(stu.getId()+" "+stu.getTel());
		}
		scanner.close();
	}

}
