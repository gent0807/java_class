package examples;

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle5[] c= new Circle5[5];
		
		for(int i=0; i<c.length; i++) {
			c[i]=new Circle5(i);
					
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.println((int)c[i].getArea()+"");
		}
	}

}
