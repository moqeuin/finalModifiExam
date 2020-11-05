package finalModifiExam;

public class FinalmoDifi {

	public static void main(String[] args) {		
	}

}

final class FinalTest{ // 다른 클래스에게 상속할 수 없다
	
	final int number = 9; // 초기화 이후 값을 변경불가능하다
	
	final void testOutput() { // 오버라이딩을 할 수 없다.
		System.out.println("테스트");
	}
}