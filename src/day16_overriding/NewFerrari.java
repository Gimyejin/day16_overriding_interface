package day16_overriding;

public class NewFerrari extends Ferrari{

	public NewFerrari(int ye, int speed) {
		super(ye, speed);
		
	}public void autoSystem() {
		System.out.println("자동자 운전 모드를 시작");
	}
	
}
