package examples03;

import java.io.*;

public class Ex01 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		try{
		 FileReader fin= new FileReader("c:\\test.txt");
		
		
		 int c; //read()가  int 타입 정수를 리턴하기 때문에
		
		 while((c=fin.read())!=-1) {
			System.out.print((char)c);//char 형변환 연산을 안해주면 문자가 아닌 정수가 출력된다.
		}
		fin.close();
		}catch(FileNotFoundException e) {
			System.out.println("");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("IO ~");
			e.printStackTrace();
		
		}catch(Exception e) {
			System.out.println("");
			e.printStackTrace();
		
		}
	
		
	}
}

