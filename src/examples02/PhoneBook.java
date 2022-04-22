package examples02;
import java.util.*;
public class PhoneBook {
	static ArrayList<Phone> p= new ArrayList<Phone>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		System.out.print("인원수>>");
		
		int n=a.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String s1=a.next();
			String s2=a.next();
			
			Phone b=new Phone(s1,s2);
			p.add(b);
		}
		System.out.println("저장되었습니다........");
		
		
		while(true) {
			System.out.print("검색할 이름>>");
			String inname= a.next();
			if(inname.equals("그만"))
				break;
			String tel=search(inname);
			if(tel==null) {
				System.out.println(inname+" 이 없습니다.");
			}
			else
				System.out.println(inname+"의 번호는 "+tel+"입니다.");
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
