package day16_overriding;

import java.util.ArrayList;

class AA extends ArrayList {
	public void aa() {
		System.out.println("나만의 기능");
	}

	public Object get(int i) {
		return "내가 만든 get이다";
	}

	public boolean add(Object o) {
		System.out.println("추가하는 기능");
		return true;
	}
}

final class BB {// 파이널이 붙으면 상속을 못 밭ㄷ게 한다.
	public void bb() {
		System.out.println("bb의 기능");
	}
}

class CC {
	BB b = new BB();// final로 인해 상속이 안되니 new를 써야함

	public void bb() {

		b.bb();
		System.out.println("cc의 기능");
	}
}

public class Ex02_Main {
	public static void main(String[] args) {
		AA a = new AA();
		a.add("hello");
		System.out.println("save: " + a.get(0));
	}
}
