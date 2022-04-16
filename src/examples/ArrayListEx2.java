package examples;
import java.util.ArrayList;
class Board{
	String subject;
	String content;
	String writer;
	Board(String subject, String content, String writer){
		this.subject=subject;
		this.content=content;
		this.writer=writer;
	}
	public String toString() {
		return this.subject+" "+this.content+" "+this.writer;
	}
}

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Board> ab= new ArrayList<>();
		Board b1=new Board("����1","����1","�۰�1");
		ab.add(b1);
		ab.add(new Board("����2","����2","�۰�2"));
		ab.add(new Board("����3","����3","�۰�3"));
		for(Board bitem:ab) {
			System.out.println(bitem.subject+" "+bitem.content+" "+bitem.writer);
		}
		for(Board bitem:ab) {
			System.out.println(bitem.toString());
		}
	}

}
