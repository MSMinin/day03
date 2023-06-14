package if_else;

public class TestClass03 {
	public static void main(String[] args) {
		int num = 50;
		if(num > 0) {
			if(num < 100) {
				System.out.println("num은 0 ~ 100사이의 값입니다.");
			}else {
				System.out.println("100보다 크다.");
			}
		}else {
			System.out.println("음수입니다.");
		}
		System.out.println("다음 문장들 실행");
	}
}
