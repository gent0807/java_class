package examples;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> I) {
		Iterator<String> it= I.iterator();
		while(it.hasNext()) {
			String e=it.next();
			String sep;
			if(it.hasNext()) {
				sep="->";
			}
			else 
				sep="\n";
			System.out.print(e+sep);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList=new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2, "아바타");
		
		Collections.sort(myList);//static 메소드
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index=Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}

}
