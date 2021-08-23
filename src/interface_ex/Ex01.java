package interface_ex;

import java.util.Scanner;

class A지상군 implements A공방 {
	@Override
	public void attck() {
		System.out.println("지상군이 공격합니다.");
	}

	@Override
	public void defense() {
		System.out.println("지상군이 빙어합니다.");
	}
}

class A공군 implements A공방 {
	@Override
	public void attck() {
		System.out.println("공군이 공격합니다.");
	}

	@Override
	public void defense() {
		System.out.println("공군이 빙어합니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * A지상군 지상군 = new A지상군(); A공군 공군 = new A공군(); upcasting으로 바꿈
		 */
		A공방 공방 = null;
		System.out.println("적이 처들어 왔습니다.");
		System.out.println("1.지상군 2.방어");

		int choice = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num == 1) {
			System.out.println("지상군 선택");
			공방 = new A지상군();
		} else {
			System.out.println("공군 선택");
			공방 = new A공군();
		}
		System.out.println("1.공격 2.방어");
		choice = input.nextInt();
		
		if(choice==1)공방.attck();
		else 공방.defense();
		/*
		if (choice == 1 && num == 1)
			지상군.attck();
		else if (choice == 2 && num == 1)
			지상군.defense();
		if (choice == 1 && num == 2)
			공군.attck();
		else if (choice == 2 && num == 2)
			공군.defense();
			*/
		
	}

}
