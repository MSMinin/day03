package if_;

import java.util.Scanner;

public class TestTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제 1
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		if (num % 3 == 0) 
			System.out.println("입력한 값은 3의 배수입니다.");
		if (num % 3 != 0) 
			System.out.println("입력한 값은 3의 배수가 아닙니다.");
		// 문제 2
		int a, b, c;
		
		System.out.println("세 수를 입력하시오.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b) {
			if(a > c)
				System.out.println("제일 큰 값 : " + a);
			if(a < c)
				System.out.println("제일 큰 값 : " + c);
		}
		if(a < b) {
			if(b > c)
				System.out.println("제일 큰 값 : " + b);
			if(b < c)
				System.out.println("제일 큰 값 : " + c);
		}
		
		//문제 3
		int n1, n2;
		System.out.println("두 값을 입력하시오.");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2 && n1 % 2 == 0) 
			System.out.println("두 수 중 큰 값이며 짝수일 경우 출력");
		if(n1 < n2 && n2 % 2 == 0) 
			System.out.println("두 수 중 큰 값이며 짝수일 경우 출력");
				
	}

}
