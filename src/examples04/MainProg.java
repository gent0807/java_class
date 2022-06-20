package examples04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainProg extends JFrame{
	Container con;
	JTextField tf_name, tf_id;
	JButton btn_bat, btn_ins, btn_dis, btn_out;
	JComboBox<String> cb_major;
	ArrayList<Student> stdList=new ArrayList<Student>();
	
	public MainProg() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con= this.getContentPane();
		con.setLayout(new FlowLayout());
		
		createGUI();
		doEvent();
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainProg();
	}
	
	public void createGUI() {
		JLabel lb_id=new JLabel("�й�");
		con.add(lb_id);
		tf_id=new JTextField(20);
		con.add(tf_id);
		JLabel lb_name=new JLabel("�̸�"); 
		con.add(lb_name);
		tf_name=new JTextField(20);
		con.add(tf_name);
		JLabel lb_major=new JLabel("�а�");
		con.add(lb_major);
		
		String[] major_code= {"��ǻ�ͼ���Ʈ�����","��ǻ��������","��������������Ű�","�����ΰ�","�濵�а�","�̽������ΰ����ɰ�"};
		cb_major=new JComboBox<String>(major_code);
		con.add(cb_major);
		
		btn_bat=new JButton("�ϰ��Է�");
		btn_ins=new JButton("�Է�");
		btn_dis=new JButton("�������");
		btn_out=new JButton("�������");
		
		con.add(btn_bat);
		con.add(btn_ins);
		con.add(btn_dis);
		con.add(btn_out);
				
	}
	
	public void doEvent() {
		btn_bat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bat_event();
			}
		});
		
		btn_ins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int id=Integer.parseInt(tf_id.getText());
				String name=tf_name.getText();
				String major=cb_major.getSelectedItem().toString();
				Student student_ex=new Student(id, name, major);
				stdList.add(student_ex);
				System.out.println(name+" �ԷµǾ����ϴ�.");
			}
		});
		
		btn_dis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dis_event();
			}
		});
		
		btn_out.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("---------------");
				System.out.println("+   �й�    +     �̸�    +    ����   +");
				for(Student student: stdList) {
					System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getStudentMajor()+"\n");
					
				}
			}
		});
	}
	
	public void bat_event() {
		
	}
	
	public void dis_event() {
		
	}

}
