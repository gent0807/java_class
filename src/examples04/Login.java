package examples04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame {
	JButton bt_submit, bt_cancel;
	JPanel panel;
	JLabel label1, label2;
	JTextField text1, text2;

	public Login() {		
		this.setTitle("LOGIN FORM �й� �̸�");
		Container con= this.getContentPane();
		label1 = new JLabel();
		label1.setText("�̸���");
		text1 = new JTextField(10);	
		label2 = new JLabel();
		label2.setText("��й�ȣ");
		text2 = new JPasswordField(10);	
		bt_submit = new JButton("�α���");
		bt_cancel = new JButton("���");	
		panel = new JPanel(new GridLayout(3, 2));
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(bt_submit);
		panel.add(bt_cancel);
		con.add(panel, BorderLayout.CENTER);
		bt_submit.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String value1 = text1.getText();
				String value2 = text2.getText();
				if (value1.equals("hong") && value2.equals("1111")) {
					System.out.println("�α��� ����");
				} else {
					System.out.println("�α��� ����");
				}			
			}
		});
		this.setSize(300, 100);
		this.setVisible(true);
	}

	public static void main(String arg[]) {
		new Login();
	}
}