package Quiz1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends Thread {
	Date date;
	SimpleDateFormat simpl;
	JLabel label;
	Container c;
	JFrame jframe;
	public static boolean check1 =true;

	/*
	 * public Frame() { jframe = new JFrame("time"); c = jframe.getContentPane();
	 * label = new JLabel("test"); c.add(label);
	 * 
	 * jframe.setLocation(1000, 200); jframe.setPreferredSize(new Dimension(500,
	 * 200)); jframe.pack();// ũ�� �����Ѱ� ������
	 * 
	 * Font font = new Font(null, 0, 40); label.setFont(font);
	 * label.setHorizontalAlignment(JLabel.CENTER);
	 * 
	 * jframe.setVisible(true);
	 * jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); for (int i = 0;; i++)
	 * { label.setText(time()); try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } }
	 */

	public void run() {
		jframe = new JFrame("time");
		c = jframe.getContentPane();
		label = new JLabel("test");
		c.add(label);

		jframe.setLocation(1000, 200);
		jframe.setPreferredSize(new Dimension(500, 200));
		jframe.pack();// ũ�� �����Ѱ� ������

		Font font = new Font(null, 0, 40);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);

		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0;; i++) {
			label.setText(time());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public String getDate() {
		return simpl.format(date);
	}

	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("aa hh�� mm�� ss�� ");

	}

	public String time() {

		setDate();
		String s = getDate();
		return s;

	}

}
