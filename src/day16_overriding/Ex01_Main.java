package day16_overriding;

public class Ex01_Main {

	public static void main(String[] args) {
		/*
		 오버라이팅
		 -상속받은 부모의 메소드의 내용을 변경(업데이트)하는것
		 조건
		 -부모메소드의 형식과 동일하게 자식 메소드를 만드는 것
		  1) 반환타입이 같아야한다
		  2) 매개변수의 개수와 타입이 같아야한다
		  3_접근 제한자 부모와 같거나 커야한다
		   private < package < proctected < public
		 */
		NewFerrari fe = new NewFerrari(2021,400);
		fe.speed(); fe.autoSystem();

	}

}
