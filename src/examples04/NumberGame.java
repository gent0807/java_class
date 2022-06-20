package examples04;
<<<<<<< HEAD

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
		super("¼ýÀÚ°ÔÀÓ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		Container con= this.getContentPane();
		
		//·£´ý ³Ñ¹ö¿Í ÇÁ·¹ÀÓ ¼³Á¤
        setRandomNum();
        //top ÆÐ³Î¿¡ µé¾î°¥ ÄÄÆ÷³ÍÆ® ±¸¼º
        JLabel lb_info = new JLabel("¼ýÀÚ¸¦ ÃßÃøÇÏ½Ã¿À : ");
        inputField = new JTextField(10);
        inputField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
                    if(Integer.parseInt(inputField.getText()) < randomNum){
                          guideLabel.setText("³Ê¹« ³·½À´Ï´Ù!");
                          guideLabel.setBackground(Color.RED);
                    }
                    else if(Integer.parseInt(inputField.getText()) > randomNum){
                          guideLabel.setText("³Ê¹« ³ô½À´Ï´Ù!");
                          guideLabel.setBackground(Color.RED);
                    }
                    else{
                          guideLabel.setText("Á¤´äÀÔ´Ï´Ù!");
                          guideLabel.setBackground(Color.WHITE);
                    }
             }
             catch(NumberFormatException ne){
                    guideLabel.setText("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù!");
                    guideLabel.setBackground(Color.RED);
             }
             inputField.selectAll();      
			}
		});
        //top ÆÐ³Î ±¸¼º
        JPanel topPanel = new JPanel();
        topPanel.add(lb_info);
        topPanel.add(inputField);
        
        //middle ÆÐ³Î¿¡ µé¾î°¥ ·¹ÀÌºí ±¸¼º
        guideLabel = new JLabel("¼ýÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À.");
        guideLabel.setBackground(Color.WHITE);
        guideLabel.setOpaque(true);//·¹ÀÌºíÀ» ºÒÅõ¸íÇÏ°Ô

        //middle ÆÐ³Î ±¸¼º
        JPanel middlePanel = new JPanel();
        middlePanel.add(guideLabel);

        //low ÆÐ³Î¿¡ µé¾î°¥ ¹öÆ° ±¸¼º
        bt_retry = new JButton("»õ °ÔÀÓ");
        bt_exit = new JButton("Á¾·á");
        bt_retry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setRandomNum();
                guideLabel.setText("¼ýÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À.");
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

        //low ÆÐ³Î ±¸¼º
        JPanel lowPanel = new JPanel();
        lowPanel.add(bt_retry);
        lowPanel.add(bt_exit);

        //¸ÞÀÎ ÆÐ³Î ±¸¼º
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(lowPanel);
        con.add(mainPanel);        
        pack();
        setVisible(true);
	}
	//Á¢±ÙÀÚ
    public int getRandomNum() {return randomNum;}
    //¼³Á¤ÀÚ
	public void setRandomNum() {
		randomNum = (int)(Math.random()*100)+1;
	}
	public static void main(String args[]) {
		new NumberGame();  
	}
} 
=======
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
		this.setTitle("ìˆ«ìž ê²Œìž„ 20211033 ì‹ ìœ¤ì„­");
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
		
		JLabel lb= new JLabel("ìˆ«ìžë¥¼ ì¶”ì¸¡í•˜ì‹œì˜¤: ");
		JTextField tf=new JTextField(20);
		
		panel1.add(lb);
		panel1.add(tf);
		
		JLabel lb1= new JLabel("ìƒíƒœ ë ˆì´ë¸”");
		
		panel2.add(lb1);
		
		JButton btn1=new JButton("ë‹¤ì‹œí•œë²ˆ");
		JButton btn2=new JButton("ì¢…ë£Œ");
		
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
>>>>>>> branch 'master' of https://github.com/gent0807/java_class.git
