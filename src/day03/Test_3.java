package day03;

import java.util.Scanner;

public class Test_3 {
	public static void main(String[] args) {
		//문제 학생 A,B,C,D,E가 돌아가면서 청소를한다. A가 1일, B가 2일, C가 3일, D가 4일, E가 5일, A가 6일...
		//총 30일까지 있는 것으로 생각하고 1 ~ 30까지의 값을 입력하면 그 날에 누가 청소를 하는지 출력하시오.
		//입력한 값이 1보다 작고 30보다 크면 잘못 입력했다고 출력하도록 하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇일인지 입력하세요. :");
//		int n = sc.nextInt();
//		
//		
//		if(n > 30 || n < 0) {
//			System.out.println("입력한 값이 1보다 작거나 30보다 큽니다.");
//		}else if (n % 5 == 1) {
//			System.out.println("A가 청소하는 날");
//		}else if (n % 5 == 2) {
//			System.out.println("B가 청소하는 날");
//		}else if (n % 5 == 3) {
//			System.out.println("C가 청소하는 날");
//		}else if (n % 5 == 4) {
//			System.out.println("D가 청소하는 날");
//		}else if (n % 5 == 0) {
//			System.out.println("E가 청소하는 날");
//		}
//		
		

		//시험 점수 3개를 입력받아 평균을 구하여 출력하고, 평균에 따라 등급 나누기
		//(90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 그 외에는 F)
		//추가로 성적에서 구한 평균을 뺀 차이 값 출력하기
				
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, avg;
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		avg = (kor + eng + math) / 3;
		
		if(avg >= 90 && 100 >= avg) {
			System.out.println("A학점입니다.");
		}else if (90 > avg && avg >= 80) {
			System.out.println("B학점입니다.");
		}else if (80 > avg && avg >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		int to_kor = kor - avg;
		int to_eng = eng - avg;
		int to_math = math - avg;
		System.out.println("입력한 점수들의 평균 : " + avg);
		System.out.println("국어 성적 차이 : " + to_kor);
		System.out.println("영어 성적 차이 : " + to_eng);
		System.out.println("수학 성적 차이 : " + to_math);
		
		
		
	}

}
