package test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test3 implements ActionListener{
	JButton btn;
	JPanel panel;
	JFrame frm;
	int i = 1;
	int y=30;
	public void createGUI(){
		frm = new JFrame();
		frm.setSize(300, 300);
		frm.setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		btn = new JButton("버튼추가");
		btn.setBounds(0, 0, 300, 30);
		btn.addActionListener(this);
		
		frm.add(btn,"North");
		frm.add(panel);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Test3().createGUI();
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn1 = new JButton("Button"+i);
		i++;
		//btn1.setBounds(30, 30+y, 100, 30);
		//y = y+30;
		panel.add(btn1);
		frm.validate();
	}
}
