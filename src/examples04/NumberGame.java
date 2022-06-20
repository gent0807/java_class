package examples04;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame {
	private int randomNum;
    private JTextField inputField;
    private JLabel guideLabel;
    private JButton bt_retry;
    private JButton bt_exit;
    
	public NumberGame() {
		super("���ڰ���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		Container con= this.getContentPane();
		
		//���� �ѹ��� ������ ����
        setRandomNum();
        //top �гο� �� ������Ʈ ����
        JLabel lb_info = new JLabel("���ڸ� �����Ͻÿ� : ");
        inputField = new JTextField(10);
        inputField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
                    if(Integer.parseInt(inputField.getText()) < randomNum){
                          guideLabel.setText("�ʹ� �����ϴ�!");
                          guideLabel.setBackground(Color.RED);
                    }
                    else if(Integer.parseInt(inputField.getText()) > randomNum){
                          guideLabel.setText("�ʹ� �����ϴ�!");
                          guideLabel.setBackground(Color.RED);
                    }
                    else{
                          guideLabel.setText("�����Դϴ�!");
                          guideLabel.setBackground(Color.WHITE);
                    }
             }
             catch(NumberFormatException ne){
                    guideLabel.setText("�߸��� �Է��Դϴ�!");
                    guideLabel.setBackground(Color.RED);
             }
             inputField.selectAll();      
			}
		});
        //top �г� ����
        JPanel topPanel = new JPanel();
        topPanel.add(lb_info);
        topPanel.add(inputField);
        
        //middle �гο� �� ���̺� ����
        guideLabel = new JLabel("���ڸ� �Է��Ͻÿ�.");
        guideLabel.setBackground(Color.WHITE);
        guideLabel.setOpaque(true);//���̺��� �������ϰ�

        //middle �г� ����
        JPanel middlePanel = new JPanel();
        middlePanel.add(guideLabel);

        //low �гο� �� ��ư ����
        bt_retry = new JButton("�� ����");
        bt_exit = new JButton("����");
        bt_retry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setRandomNum();
                guideLabel.setText("���ڸ� �Է��Ͻÿ�.");
                inputField.setText("");
			}
		});
        bt_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 System.exit(0);
			}
        });

        //low �г� ����
        JPanel lowPanel = new JPanel();
        lowPanel.add(bt_retry);
        lowPanel.add(bt_exit);

        //���� �г� ����
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(lowPanel);
        con.add(mainPanel);        
        pack();
        setVisible(true);
	}
	//������
    public int getRandomNum() {return randomNum;}
    //������
	public void setRandomNum() {
		randomNum = (int)(Math.random()*100)+1;
	}
	public static void main(String args[]) {
		new NumberGame();  
	}
} 