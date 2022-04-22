package examples02;
import java.util.Scanner;
public class Grade {
	private int math;
	private int science;
	private int english;	
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math=math;
	}
	
	public int getScience() {
		return science;
	}
	
	public void setScience(int science) {
		this.science=science;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public void setEnglish(int english) {
		this.english=english;
	}
	
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	
	public Grade() {
		this(0, 0, 0);
	}
	public double average() {
		double avg=(math+science+english)/3;
		return avg;
	}

	

}
