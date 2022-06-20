package examples04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxDemo extends JFrame {
	JCheckBox[] cb_btns = new JCheckBox[4];
	String[] fruits = { "�������� ��ȯ", "�ڵ����ӱ���ϱ�ȯ", "���������ͱ�ȯ", "Ÿ�̾� ��ȯ"};
	int[] prices = { 45000, 80000, 30000, 100000 };
	int money=0; 	JLabel label;	
	public CheckBoxDemo() {
		super("�ڵ��� ����� �� �й� �̸�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container con = this.getContentPane(); 
		con.setLayout(new FlowLayout());		
		// üũ �ڽ� ����
		for (int i = 0; i < 4; i++) {
			cb_btns[i] = new JCheckBox(fruits[i]);
			this.add(cb_btns[i]);
		}
		JButton btn = new JButton("Ȯ��"); 
		con.add(btn); 
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/** üũ �ڽ��� ������ �̺�Ʈ�� ó���Ѵ�. */
				money = 0; 
				for (int i = 0; i < 4; i++) {
					if (cb_btns[i].isSelected()) 
							money += prices[i];									
				}
				label.setText("��������� ������"+money+"�Դϴ�.");
			}
		});		
		label = new JLabel("��������� ������"+money+"�Դϴ�.");
		label.setFont(new Font("Serif", 	// ���̺� ��Ʈ�� �����Ѵ�. 
				Font.BOLD | Font.ITALIC, 30)); 
		con.add(label);				
		this.setSize(500, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {		
		new CheckBoxDemo();
	}
}