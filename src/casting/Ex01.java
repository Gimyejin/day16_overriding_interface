package casting;
class A01{
	public void getText() {
		System.out.println("A class");
	}
}
class B01 extends A01{
	public void getText() {
		System.out.println("B class");
	}
}
class C01 extends A01{
	public void getText() {
		System.out.println("C class");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		/*
		  up casting(����ȯ)
		  - �ڽ� ������ ���� �θ� ���·� ��ȯ�ϴ� ��
		  down casting(����ȯ)
		  - �θ����¿��� �ڽ����·� ��ȯ�ϴ� ��
		 */
		/*	
	  B01 b = new B01();
		b.getText();
		C01 c = new C01();
		c.getText();
		*/
		
		//upcasting
		A01 a =new B01();
		a.getText();
		
		a=new C01();
		a.getText();
	}
}
