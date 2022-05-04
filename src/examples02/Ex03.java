import java.io.*;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="c:\\dream.txt";
		String output="c:\\dreamCopy.txt";
		
		try {
			FileReader fin= new FileReader(input);
			FileWriter fout= new FileWriter(output);
			int ch;
			while((ch=fin.read())!=-1) {
				fout.write(ch);
				System.out.print((char)ch);
			}
			fin.close();
			fout.close();
		}
		
		catch(Exception e){
			System.out.println("예외 발생~");
			e.printStackTrace();
			
		}
	}

}
