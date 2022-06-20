package examples04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainProg extends JFrame{
	Container con;
	
	
	public MainProg() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con= this.getContentPane();
		con.setLayout(new FlowLayout());
		
		createGUI();
		doEvent();
		
		this.setSize(500,500);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainProg();
	}
	
	public void createGUI() {
		JLabel lb_name=new JLabel("이름");
		con.add(lb_name);
		JTextField tf_name=new JTextField(20);
		con.add(tf_name);
		JLabel lb_id=new JLabel("학번"); 
	}
	
	public void doEvent() {
		
	}

}
