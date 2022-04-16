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
		map.put("황기태", new Student6(1, "010-111-1111"));
		map.put("이재문", new Student6(2, "010-222-2222"));
		map.put("김남윤", new Student6(3, "010-333-3333"));
		
		Scanner scanner= new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name= scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student6 stu=map.get(name);
			if(stu==null) {
				System.out.println(name+"은 없는 사람입니다.");
			}
			else
				System.out.println(stu.getId()+" "+stu.getTel());
		}
		scanner.close();
	}

}
