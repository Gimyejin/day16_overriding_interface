package interface_ex;

interface Test {
	// public int aÇÏ¸é ¿¡·¯³²
	public static final int a = 123;// Àº µÊ
	public final int a1 = 12345;// Àº µÊ
	public static int a2 = 12356;// Àº µÊ
	
	public static String id ="È«±æµ¿";
	public static String pw ="1111";

}

public class Ex03 implements Test {
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pw);
	}

}
