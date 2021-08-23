package abstract_ex;
abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo(); 
}
class NewAbstract extends Abstract{
	public void combo() {
		System.out.println(num+" 단 콤보 공격 & 2 대 더 때리기");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		//추상화
		Abstract a = new NewAbstract();
		a.setNum(3);
		a.combo();

	}

}
