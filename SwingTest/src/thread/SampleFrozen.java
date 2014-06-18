package thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class SampleFrozen implements ActionListener{
	JLabel label;
	public void createGUI(){
		JFrame frm = new JFrame("Frozen");
		frm.setSize(300, 200);
		JButton btn = new JButton("시작");
		btn.addActionListener(this);
		label = new JLabel("0", SwingConstants.CENTER);
		
		
		frm.add(btn, "North");
		frm.add(label, "Center");

		frm.setDefaultCloseOperation(3);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new SampleFrozen().createGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread th = new MyThread();
		th.start();

	}
	class MyThread extends Thread{
		@Override
		public void run(){
			for(int i=0;i<=10;i++){
				final int ii = i;
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run(){
						label.setText(ii+" ");
					}
				});

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}
		}
	}

}	


