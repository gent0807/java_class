import java.io.*;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout;
		try {
			fout= new FileWriter("c:\\output.txt");
			while(true) {
				String line= scanner.nextLine();
			    if(line.length()==0) 
			    	break;
			    if(line.equals("그만")) 
			    	break;
				fout.write(line+"\n");
				
			}
			System.out.println("파일 쓰기 완성~");
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("입출력오류");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("기타오류");
			e.printStackTrace();
		}
	}

}
