package examples;
import java.util.ArrayList;
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		a.add("Hello");
		a.add("Hi");
		a.add("java");
		int n=a.size();
		a.add(2, "Sahni");
		for(int i=0; i<n; i++) {
			System.out.println(a.get(i));
		}
		a.remove(1);
		//a.clear();
		for(String item:a) {
			System.out.println(item);
		}
		ArrayList<Integer> ai= new ArrayList<>();
		ai.add(100);
		ai.add(200);
		ai.add(300);
		for(Integer item:ai) {
			System.out.println(ai);
		}
	}

}
