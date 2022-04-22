package examples02;

import java.util.Scanner;
/*
 20210133 신윤섭 
 */
 

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		
		Grade me= new Grade(math, science, english);
		System.out.println("나의 평균은 " +me.average());
		System.out.println("수학점수는 "+me.getMath()+" 과학점수는 "+me.getScience()+" 영어점수는 "+me.getEnglish());
		Grade haha=new Grade();
		System.out.println("하하의 평균은 " +me.average());
		System.out.println("수학점수는 "+me.getMath()+" 과학점수는 "+me.getScience()+" 영어점수는 "+me.getEnglish());
		scanner.close();
	}

}
