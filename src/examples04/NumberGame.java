package examples04;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame{
	
	public NumberGame() {
		this.setTitle("숫자 게임 20211033 신윤섭");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container con= this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel panel2=new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel panel3=new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
				
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		
		JLabel lb= new JLabel("숫자를 추측하시오: ");
		JTextField tf=new JTextField(20);
		
		panel1.add(lb);
		panel1.add(tf);
		
		JLabel lb1= new JLabel("상태 레이블");
		
		panel2.add(lb1);
		
		JButton btn1=new JButton("다시한번");
		JButton btn2=new JButton("종료");
		
		panel3.add(btn1);
		panel3.add(btn2);
		
		
		this.setSize(300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberGame();
		
	}

}