package examples04;

public class Student {
	private int studentId;
	private String studentName;
	private String studentMajor;
	
	public Student(int studentId, String studentname, String studentMajor) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentMajor=studentMajor;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public String getStudentMajor() {
		return this.studentMajor;
	}
	
	public void setStudentmajor(String studentMajor) {
		this.studentMajor=studentMajor;
	}

}
