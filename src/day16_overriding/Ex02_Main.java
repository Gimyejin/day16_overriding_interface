package day16_overriding;

import java.util.ArrayList;

class AA extends ArrayList {
	public void aa() {
		System.out.println("������ ���");
	}

	public Object get(int i) {
		return "���� ���� get�̴�";
	}

	public boolean add(Object o) {
		System.out.println("�߰��ϴ� ���");
		return true;
	}
}

final class BB {// ���̳��� ������ ����� �� �礧�� �Ѵ�.
	public void bb() {
		System.out.println("bb�� ���");
	}
}

class CC {
	BB b = new BB();// final�� ���� ����� �ȵǴ� new�� �����

	public void bb() {

		b.bb();
		System.out.println("cc�� ���");
	}
}

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		a.add("hello");
		System.out.println("save: " + a.get(0));
	}
}
