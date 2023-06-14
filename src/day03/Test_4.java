package day03;

import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) {
		// 문제 1
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
		// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		if(100 >= num && num >= 90) {
//			System.out.println("A");
//		}else if(90 > num &&  num>= 80) {
//			System.out.println("B");
//		}else if(80 > num &&  num>= 70) {
//			System.out.println("C");
//		}else if(70 > num && num >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		// 문제 2
		// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
		// 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		// 입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		// 출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도를 입력하세요. :");
//		int year = sc.nextInt();
//		
//		if(year % 4 == 0) { //윤년
//			if(year % 100 != 0 || year % 400 == 0) { //윤년
//				System.out.println("윤년입니다." + 1);
//			}else {
//				System.out.println("윤년이 아닙니다." + 0);
//			}
//		}else {
//			System.out.println("윤년이 아닙니다." + 0);
//		}
		
		//문제3
		//세 개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램을 작성하세요. 단, if 문만을 사용하여 구현해야 합니다.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값을 입력하세요. : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if(a > b) {
//			if(a > c) {
//				System.out.println("출력되는 가장 큰 값 : " + a);
//			}else {
//				System.out.println("출력되는 가장 큰 값 : " + c);
//			}
//		}else {
//			if(b > c) {
//				System.out.println("출력되는 가장 큰 값 : " + b);
//			}else {
//				System.out.println("출력되는 가장 큰 값 : " + c);
//			}
//		}

		
	}
}
