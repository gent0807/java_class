package examples04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageGallary extends JFrame{
	int i;
	
	public ImageGallary() {
		this.setTitle("Image Gallary Practice Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con=this.getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel pan=new JPanel();
		pan.setLayout(new FlowLayout());
		con.add(pan,BorderLayout.NORTH);
		JLabel lb=new JLabel();
		con.add(lb,BorderLayout.CENTER);
		
		JButton left=new JButton("left");
		JButton right=new JButton("right");
		pan.add(left);
		pan.add(right);
		
		ImageIcon[] images=new ImageIcon[5];
		images[0]=new ImageIcon("C:\\apple.jpg");
		images[1]=new ImageIcon("C:\\banana.jpg");
		images[2]=new ImageIcon("C:\\mango.jpg");
		images[3]=new ImageIcon("C:\\grape.jpg");
		images[4]=new ImageIcon("C:\\avocado.jpg");
		
		lb.setIcon(images[0]);
		left.setVisible(false);
		
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				right.setVisible(true);
				if(i>0) {					
					i--;
					lb.setIcon(images[i]);
					if(i==0) {
					left.setVisible(false);
					}
				}
				
			}
		});
		
         right.addActionListener(new ActionListener() {
			
			  @Override
			  public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				left.setVisible(true);
				if(i<4) {
					i++;
					lb.setIcon(images[i]);
					if(i==4) {
					right.setVisible(false);
					}
				}
				
			}
		});
		

		this.setSize(500,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageGallary();
		new ImageGallary();
	}

}
