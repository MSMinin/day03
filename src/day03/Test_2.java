package day03;

import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
	
		// 문제 1
		// BMI 지수 구하기
		// BMI 지수의 계산식 -> BMI = 체중(kg) / (키(m) * 키(m))
		// BMI 지수에 따른 정보
		// - 18.5 미만 : 저체중
		// - 18.5 이상 ~ 23 미만 : 정상
		// - 23 이상 ~ 25 미만 : 과체중
		// - 25 이상 ~ 30 미만 : 비만
		// - 30 이상 : 고도비만
		//
		// 체중, 키를 입력 받아서 BMI 지수를 구하고 저체중, 정상, 과체중, 비만나타내기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("키를 입력해주세요. : ");
//		double cm = sc.nextDouble();	
//		System.out.print("체중을 입력해주세요. : ");
//		double kg = sc.nextDouble();
//
//		
//		double bmi = kg / (cm/100 *  cm/100);
//		
//		if(bmi >= 30) {
//			System.out.println(bmi + "를 보니 고도비만입니다.");
//		}else if(30 > bmi && bmi >= 25) {
//			System.out.println(bmi + "를 보니 비만입니다.");
//		}else if(25 > bmi && bmi >= 23) {
//			System.out.println(bmi + "를 보니 과체중입니다.");
//		}else if(23 > bmi && bmi >= 18.5) {
//			System.out.println(bmi + "를 보니 정상입니다.");
//		}else if(18.5 > bmi) {
//			System.out.println(bmi + "를 보니 저체중입니다.");
//		}
		
		
		
		// 문제 2
		//	** 가위바위보 게임 **
		//	추가 개념 <랜덤수 구하기>
		//	Math.random()  
		//	사용하면 0.0 에서 1 사이의 double 랜덤수를 얻을 수 있다
		//
		//	Math.random() * 숫자 : 입력한 숫자보다 작지만 무한히 가까운 수들이 만들어진다.
		//
		//	예시) Math.random() * 12
		//	: 12보다 작지만 무한히 가까운 수들이 만들어 진다.
		//	0.9 * 12 = 10.8
		//	0.99 * 12 = 11.88
		//	0.999 * 12 = 11.988
		//	...
		//
		//	 == > (int) Math.random() * (최댓값-최소값+1) + 최소값
		//	예시) 1 ~ 12까지의 랜덤 숫자 10가지 출력
		//	(int) (Math.random() * (12-1+1)) + 1
		//	→ (int) (Math.random() * 12) + 1
		//
		//	가위바위보 게임에서는 세개의 수 중 1가지의 랜덤숫자가 필요하므로
		//	(int)(Math.random()*3)+1; 이런 식으로 나타낼 수 있다.
		//
		//	Q. 위의 랜덤함수를 이용해서 가위바위보 게임 만들기 
		//	예시
		//	=======가위 바위 보 게임 ======
		//	가위(1), 바위(2), 보(3)중에 숫자 하나를 입력하세요
		//	가위 바위 보! ==> 2
		//	===========
		//	비겼습니다
		//	============
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가위(1), 바위(2), 보(3) 중에 숫자 하나를 입력하세요. : ");
//		int n = sc.nextInt();
//		
//		int r = (int)(Math.random() * 3) + 1; 
//		
//		if(r == 1) {
//			if(n == 1) {
//				System.out.println("비겼습니다.");
//			}else if (n == 2) {
//				System.out.println("이겼습니다.");
//			}else if(n == 3) {
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("1, 2, 3 중에 1개를 골라주세요.");
//			}
//		}else if (r == 2) {
//			if(n == 1) {
//				System.out.println("졌습니다.");
//			}else if (n == 2) {
//				System.out.println("비겼습니다.");
//			}else if(n == 3) {
//				System.out.println("이겼습니다.");
//			}else {
//				System.out.println("1, 2, 3 중에 1개를 골라주세요.");
//			}
//		}else {
//			if(n == 1) {
//				System.out.println("이겼습니다.");
//			}else if (n == 2) {
//				System.out.println("졌습니다.");
//			}else if(n == 3) {
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("1, 2, 3 중에 1개를 골라주세요.");
//			}
//		}
		
		
		
		// 문제 3
		// 세자리수 정수를 입력 받아 그 정수의 백의자리,십의자리,일의자리가 같은지 판별하세요
		// ex) 999 입력 -> 999는 백의자리,십의자리,일의자리 정수가 같습니다
		// 996 입력 -> 996은 백의자리,십의자리,일의자리 정수가 같지 않습니다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("세자리수 정수를 입력해주세요, : ");
//		int n = sc.nextInt();
//		
//		int n1 = n / 100;
//		int n2 = (n % 100) / 10;
//		int n3 = n % 10;
//		
//		if(n1 == n2) {
//			if(n1 == n3) {
//				if(n2 == n3) {
//					System.out.println(n + "은 백의자리, 십의자리, 일의자리 정수가 같습니다.");
//				}else {
//					System.out.println(n + "은 백의자리, 십의자리, 일의자리 정수가 같지 않습니다.");
//				}
//			}else {
//				System.out.println(n + "은 백의자리, 십의자리, 일의자리 정수가 같지 않습니다.");
//			}
//		}else {
//			System.out.println(n + "은 백의자리, 십의자리, 일의자리 정수가 같지 않습니다.");
//		}		
		
	}
}
