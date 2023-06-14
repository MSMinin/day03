package if_else_if;

import java.util.Scanner;

public class TestTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//문제 1
		int cof = 2000;
		int n;
		System.out.print("커피 갯수를 입력하시오. : ");
		n = sc.nextInt();
		if(n > 10) {
			int a = n - 10;
			cof = 1500;
			int sum = 20000 + (a * cof);
			System.out.println("커피의 총 값은 "+ sum + "입니다.");
		}else if (n > 0 && n <= 10){
			int sum = cof * n;
			System.out.println("커피의 총 값은 "+ sum + "입니다.");
		}else {
			System.out.println("커피를 구매하지 않았습니다.");
		}
		
		//문제 2
		System.out.print("정수를 입력하시오. : ");
		int a = sc.nextInt();
		
		if(a == 0) {
			System.out.println("입력한 값은 0입니다.");
		}else if(a < 0) {
			System.out.println("음수를 입력하셨습니다.");
		}else if(a % 3 == 0) {
			if(a % 4 == 0) {
				System.out.println("입력한 정수는 3의 배수이면서 4의 배수입니다.");
			}else {
				System.out.println("입력한 정수는 3의 배수입니다.");
			}
		}else if (a % 4 ==0) {
			System.out.println("입력한 정수는 4의 배수입니다.");
		}else{
			System.out.println("입력한 정수는 3의 배수도 4의 배수에도 속하지 않습니다.");
		}
	}
}
