package examples03;

import java.io.*;

public class Ex01 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		try{
		 FileReader fin= new FileReader("c:\\test.txt");
		
		
		 int c; //read()��  int Ÿ�� ������ �����ϱ� ������
		
		 while((c=fin.read())!=-1) {
			System.out.print((char)c);//char ����ȯ ������ �����ָ� ���ڰ� �ƴ� ������ ��µȴ�.
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

