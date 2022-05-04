package examples03;

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
			    if(line.equals("洹몃쭔")) 
			    	break;
				fout.write(line+"\n");
				
			}
			System.out.println("�뙆�씪 �벐湲� �셿�꽦~");
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�엯異쒕젰�삤瑜�");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("湲고��삤瑜�");
			e.printStackTrace();
		}
	}

}
