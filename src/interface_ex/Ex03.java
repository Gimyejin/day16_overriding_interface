package interface_ex;

interface Test {
	// public int a�ϸ� ������
	public static final int a = 123;// �� ��
	public final int a1 = 12345;// �� ��
	public static int a2 = 12356;// �� ��
	
	public static String id ="ȫ�浿";
	public static String pw ="1111";

}

public class Ex03 implements Test {
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pw);
	}

}
