package Quiz1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseTjme extends Frame {
	private int second;
	//static boolean check1 = true;
	
	public UseTjme() {
		second = 0;
	}

	public void run() {
		jframe = new JFrame("time");
		c = jframe.getContentPane();
		label = new JLabel("test");
		c.add(label);

		while (check1) {
			second++;
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}super.setDate();
			label.setText(super.getDate());
		}
		int reHour = second / (60 * 60);
		int reSecond = second % (60 * 60);
		int reMinute = reSecond / 60;
		reSecond = reSecond % 60;// �е� ����
		label.setText(reHour + "�� " + reMinute + "�� " + reSecond + "�� ���");
		System.out.println("�� �ð�: " + second);

	}
}
