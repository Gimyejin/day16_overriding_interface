package day16_overriding;

public class Ex01_Main {

	public static void main(String[] args) {
		/*
		 ����������
		 -��ӹ��� �θ��� �޼ҵ��� ������ ����(������Ʈ)�ϴ°�
		 ����
		 -�θ�޼ҵ��� ���İ� �����ϰ� �ڽ� �޼ҵ带 ����� ��
		  1) ��ȯŸ���� ���ƾ��Ѵ�
		  2) �Ű������� ������ Ÿ���� ���ƾ��Ѵ�
		  3_���� ������ �θ�� ���ų� Ŀ���Ѵ�
		   private < package < proctected < public
		 */
		NewFerrari fe = new NewFerrari(2021,400);
		fe.speed(); fe.autoSystem();

	}

}
