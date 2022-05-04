package examples03;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="c:\\spring.jpg";
		String output="c:\\springCopy.jpg";
		
		try{
			FileInputStream fin = new FileInputStream(input);
			FileOutputStream fout = new FileOutputStream(output);
			int ch;
			while((ch=fin.read())!= -1){
				fout.write(ch);
			}
			System.out.println("�옉�뾽�씠 �셿猷뚮릺�뿀�뒿�땲�떎.");
			fin.close();
			fout.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�삁�쇅 諛쒖깮~");
			
		}
	}

}
