package test;



import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1{

	public void createGUI(){
		JFrame frm = new JFrame("Absolute");
		frm.setSize(300,200);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,4)); // 플로어로 바꾸면 강제지정위치로감
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JButton btn7 = new JButton("버튼7");
		JButton btn8 = new JButton("버튼8");
		JButton btn9 = new JButton("버튼9");
		JButton btn10 = new JButton("버튼10");
	
		
		btn1.setBounds(20, 5, 70 , 30);
		btn2.setBounds(100, 5, 70, 30);
		btn3.setBounds(180, 5, 70, 30);
		btn4.setBounds(20, 45, 70, 30);
		btn5.setBounds(100, 45, 70, 30);
		btn6.setBounds(180, 45, 70, 30);
		btn7.setBounds(20, 85, 70, 30);
		btn8.setBounds(100, 85, 70, 30);
		btn9.setBounds(180, 85, 70, 30);
		btn10.setBounds(100, 125, 70, 30);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		
		frm.add(panel);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
					new Test1().createGUI();
			}
		});
	}

	
	
	
	

}
