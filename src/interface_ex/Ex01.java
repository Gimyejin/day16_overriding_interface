package interface_ex;

import java.util.Scanner;

class A���� implements A���� {
	@Override
	public void attck() {
		System.out.println("������ �����մϴ�.");
	}

	@Override
	public void defense() {
		System.out.println("������ �����մϴ�.");
	}
}

class A���� implements A���� {
	@Override
	public void attck() {
		System.out.println("������ �����մϴ�.");
	}

	@Override
	public void defense() {
		System.out.println("������ �����մϴ�.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * A���� ���� = new A����(); A���� ���� = new A����(); upcasting���� �ٲ�
		 */
		A���� ���� = null;
		System.out.println("���� ó��� �Խ��ϴ�.");
		System.out.println("1.���� 2.���");

		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num == 1) {
			System.out.println("���� ����");
			���� = new A����();
		} else {
			System.out.println("���� ����");
			���� = new A����();
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		
		if(choice==1)����.attck();
		else ����.defense();
		/*
		if (choice == 1 && num == 1)
			����.attck();
		else if (choice == 2 && num == 1)
			����.defense();
		if (choice == 1 && num == 2)
			����.attck();
		else if (choice == 2 && num == 2)
			����.defense();
			*/
		
	}

}
