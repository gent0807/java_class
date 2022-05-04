import java.io.*;

public class Ex01 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		try{
		 FileReader fin= new FileReader("c:\\test.txt");
		
		
		 int c;
		
		 while((c=fin.read())!=-1) {
			System.out.print((char)c);
		}
		fin.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일없음 에러");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("IO 에러~");
			e.printStackTrace();
		
		}catch(Exception e) {
			System.out.println("기타에러");
			e.printStackTrace();
		
		}
	
		
	}
}

