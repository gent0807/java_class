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
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		
		Collections.sort(myList);//static �޼ҵ�
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index=Collections.binarySearch(myList, "�ƹ�Ÿ")+1;
		System.out.println("�ƹ�Ÿ�� "+index+"��° ����Դϴ�.");
	}

}
