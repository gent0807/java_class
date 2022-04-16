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
		Board b1=new Board("제목1","내용1","작가1");
		ab.add(b1);
		ab.add(new Board("제목2","내용2","작가2"));
		ab.add(new Board("제목3","내용3","작가3"));
		for(Board bitem:ab) {
			System.out.println(bitem.subject+" "+bitem.content+" "+bitem.writer);
		}
		for(Board bitem:ab) {
			System.out.println(bitem.toString());
		}
	}

}
