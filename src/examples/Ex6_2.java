package examples;

class Point2{
	private int x, y;
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point2("+x+","+y+")";
	}
}
public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p= new Point2(2,3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p+"�Դϴ�.");
	}

}
