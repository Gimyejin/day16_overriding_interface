package Quiz1;

import java.util.Scanner;

public class Login extends Win7{

	public Login() {
		Scanner input = new Scanner(System.in);
		member ex = new member();
		int num = 0;
		String inputId = null;
		String inputPw = null;
		Frame frame ;
		Time time = new Time();
		
		
		while (true) {
			System.out.println("1.�α��� 2.���� 3.�α׾ƿ�");
			System.out.println(">>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("���̵�: ");
				inputId = input.next();
				System.out.print("��й�ȣ: ");
				inputPw = input.next();
				if (ex.getId() == null)
					//������ �ȵǾ�������
					System.out.println("ȸ�������� ���ּ���.");
				else if (ex.getId().equals(inputId) && ex.getPw().equals(inputPw)) {
					//�α��� ����
					System.out.println("�α��� ����");
									
					run();
					
					
				} else if (ex.getId().equals(null))
					//�α��� ����
					System.out.println("�α��� ����");
				break;
			case 2:
				System.out.print("���� id: ");
				inputId = input.next();
				if (ex.getId() == null) {
					// ���̵� ������
					System.out.print("���� pw: ");
					inputPw = input.next();

					ex.setId(inputId);
					ex.setPw(inputPw);
					System.out.println("���� �Ϸ�");

				} else if (ex.getId().equals(inputId)) {
					// ���̵� ���� ��
					System.out.println("�̹� ���Ե� ���̵��Դϴ�.");
				} else {
					// ���̵� ������ �ٸ���
					System.out.print("���� pw: ");
					inputPw = input.next();

					ex.setId(inputId);
					ex.setPw(inputPw);
					System.out.println("���� �Ϸ�");
				}
				break;
			case 3:
				System.out.println("�α׾ƿ� �մϴ�.");
				;
				System.exit(1);
				;
			}

		}

	}

}
