package image;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import test.Test1;

public class ImageIconSample {
	public void createGUI(){
		JFrame frm = new JFrame("ImageIconSample");
		frm.setBounds(100, 100, 500, 500);
		frm.setLayout(null);
		
		frm.setLayout(null);
		
		try{
			Image frmIcon = ImageIO.read(new File("image/11.gif"));
			frm.setIconImage(frmIcon);
		}catch(IOException e){
			System.out.println("파일을 읽어오는중에 오류가 발생되었습니다.");
		}
		
		ImageIcon icon1 = new ImageIcon("image/09.gif");
		ImageIcon icon2 = new ImageIcon("image/10.gif");
		ImageIcon icon3 = new ImageIcon("image/11.gif");
		ImageIcon icon4 = new ImageIcon("image/22.gif");
		JButton btn1 = new JButton(icon1);
		JButton btn2 = new JButton(icon2);
		JButton btn3 = new JButton(icon3);
		JButton btn4 = new JButton(icon4);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btn4);
		
		btn1.setBounds(10, 10, 40, 40);
		Rectangle rect1 = new Rectangle(60,60,40,40);
		btn2.setBounds(rect1);
		btn3.setBounds(200,200,60,60);
		btn4.setBounds(100,300,80,30);
		
		frm.setDefaultCloseOperation(3);
		frm.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
					new ImageIconSample().createGUI();
			}
		});

}
}
